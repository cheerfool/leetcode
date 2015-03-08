package test;

public class StrStr {
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m= needle.length();
        int match= 0;
        if(m==0)
            return 0;
        if(m>n)
            return -1;
        for(int i=0; i<n; i++){
            if(haystack.charAt(i)==needle.charAt(match)){
                match++;
                if(match==m)
                    return i-m+1;
            }else{
                i-= match;
                match=0;
            }
        }
        return -1;
    }
}
