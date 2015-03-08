package test;

public class CountAndSay2 {
    public String countAndSay(int n) {
        if(n<1){
            return "";
        }else if(n==1){
            return "1";
        }
        String last="1";
        for(int i=1;i<n;i++){
            String result="";
            int len= last.length();
            char currentCh=last.charAt(0);
            int count=1;
            for(int j=1; j<len; j++){
                char ch= last.charAt(j);
                if(ch==currentCh){
                    count++;
                }else{
                    result= result+count+currentCh;
                    currentCh=ch;
                    count=1;
                }
            }
            result= result+count+currentCh;
            last= result;
        }
        return last;
    }
}
