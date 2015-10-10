package handbook;

public class LongestNonRepeatingSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("aaaaa"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int len = s.length();
		int[] count = new int[256];
		int head = 0, i = 0, longest = 0, sublen = 0;
		for (i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (count[ch] > 0) {
				if (sublen > longest)
					longest = sublen;
				for (int j = head; j < i; j++) {
					if (s.charAt(j) == ch) {
						head = j + 1;
						sublen = i - j;
						break;
					} else {
						count[s.charAt(j)] = 0;
					}
				}
			} else {
				count[ch]++;
				sublen++;
			}
		}
		if (sublen > longest)
			longest = sublen;
		return longest;
	}
}
