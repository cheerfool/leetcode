package test;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        int tail= s.length();
        for(int i=tail-1; i>=0; i--){
            if(s.charAt(i)==' ')
                tail--;
            else
                break;
        }
        for(int i=0; i<tail; i++){
            if(s.charAt(i)==' ')
                count=0;
            else
                count++;
        }
        return count;
    }
}
