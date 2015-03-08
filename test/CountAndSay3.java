package test;

import java.util.HashMap;


public class CountAndSay3 {
	HashMap<Integer,String> map= new HashMap<Integer,String>();
	public CountAndSay3(){
		map.put(1, "1");
	}
    public String countAndSay(int n) {
        if(n<1){
            return "";
        }
        if(map.containsKey(n)){
            return map.get(n);
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
        map.put(n,result);
        return result;
    }
}
