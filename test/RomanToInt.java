package test;

public class RomanToInt {
    public int romanToInt(String s) {
        int value=0;
        int len= s.length();
        if(len==0)
            return 0;
        int cur=0;
        int next=charToInt(s.charAt(0));
        for(int i=0; i<len-1; i++){
            cur= next;
            next= charToInt(s.charAt(i+1));
            if(cur<next)
                value-=cur;
            else
                value+=cur;
        }
        value+=charToInt(s.charAt(len-1));
        return value;
    }
    
    public int charToInt(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
