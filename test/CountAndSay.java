package test;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n<1){
            return "";
        }else if(n==1){
            return "1";
        }
        String last=countAndSay(n-1);
        String result="";
        int len= last.length();
        char currentCh=last.charAt(0);
        int count=1;
        for(int i=1; i<len; i++){
            char ch= last.charAt(i);
            if(ch==currentCh){
                count++;
            }else{
                result= result+count+currentCh;
                currentCh=ch;
                count=1;
            }
        }
        result= result+count+currentCh;
        return result;
    }
}
