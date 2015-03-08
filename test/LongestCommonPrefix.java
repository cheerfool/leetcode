package test;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if((strs==null)||(strs.length==0))
            return "";
            
        StringBuffer sb= new StringBuffer();
        int n= strs[0].length();
        for(int i=0; i<n; i++){
            char ch= strs[0].charAt(i);
            for(String str: strs){
                if((str.length()<i+1)||(str.charAt(i)!=ch))
                    return sb.toString();
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
