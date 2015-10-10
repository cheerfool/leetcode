package handbook;

public class isNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isANumber(" 1.2e1.0  "));
	}

	public static boolean isANumber(String s) {
		int head = 0, len = s.length();
		while (len > 0 && s.charAt(len - 1) == ' ')
			len--;
		while (head < len && s.charAt(head) == ' ')
			head++;
		if (head < len && (s.charAt(head) == '+' || s.charAt(head) == '-'))
			head++;
		boolean isValid = false, isDecimal = false, isEx = false;
		for (int i = head; i < len; i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				isValid = true;
			} else if (ch == '.' && !isDecimal && !isEx) {
				isDecimal = true;
			} else if (ch == 'e' && isValid && !isEx) {
				isEx = true;
				isValid = false;
			} else if (!((ch == '+' || ch == '-') && !isValid && isEx)) {
				return false;
			}
		}
		return isValid;
	}
}
