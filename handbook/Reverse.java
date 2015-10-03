package handbook;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a b";
		// System.out.println(reverseWords2(s));
		char[] chs = s.toCharArray();
		System.out.println(chs);
		reverseInPlace(chs);
		System.out.println(chs);
	}

	public static String reverseWords(String s) {
		int head = 0, tail = 0;
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = len - 1; i >= 0; i--) {
			while (s.charAt(i) == ' ' && i > 0)
				i--;
			tail = i;
			while (i > 0 && s.charAt(i - 1) != ' ')
				i--;
			head = i;
			if (s.charAt(head) != ' ')
				sb.append(s.substring(head, tail + 1) + " ");
		}
		int sblen = sb.length();
		return sblen > 0 ? sb.substring(0, sb.length() - 1) : "";
	}

	public static String reverseWords2(String s) {
		int len = s.length();
		int head = 0, tail = len;
		StringBuilder sb = new StringBuilder();

		for (int i = len - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				tail = i;
			} else if (i == 0 || s.charAt(i - 1) == ' ') {
				head = i;
				sb.append(s.substring(head, tail) + " ");
			}
		}

		int sblen = sb.length();
		return sblen > 0 ? sb.substring(0, sblen - 1) : "";
	}

	public static void reverseInPlace(char[] chs) {
		int len = chs.length;
		reverse(chs, 0, len);
		int head = 0;
		for (int i = 1; i < len; i++) {
			if (chs[i] == ' ') {
				reverse(chs, head, i);
				head = i + 1;
				i++;
			}
		}
		reverse(chs, head, len);
	}

	public static void reverse(char[] chs, int start, int end) {
		int len = end - start;
		for (int i = 0; i < len / 2; i++) {
			char temp = chs[start + i];
			chs[start + i] = chs[start + len - 1 - i];
			chs[start + len - 1 - i] = temp;
		}
	}
}
