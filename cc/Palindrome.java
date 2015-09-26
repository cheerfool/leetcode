package cc;

public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
    	int len = s.length();
        int head = 0;
        int tail = len - 1;
        
        while (head < tail) {   
            while (head < tail && !Character.isLetterOrDigit(s.charAt(head))) {
                head++;
            }
            while (head < tail && !Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
            }
            if(s.charAt(head) != s.charAt(tail))
                return false;
            head++;
            tail--;
        }
        return true;
    }
}