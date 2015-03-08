package test;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null)
            return true;
        int n= s.length();
        int head=-1, tail=n;
        while(head<tail){
            int front=-1, back=-1;
            for(head=head+1; head<tail; head++){
                char ch= s.charAt(head);
                if((ch>='0')&&(ch<='9')){
                    front= ch;
                    break;
                }else if((ch>='a')&&(ch<='z')){
                    front= ch;
                    break;
                }else if((ch>='A')&&(ch<='Z')){
                    front= ch-'A'+'a';
                    break;
                }
            }
            if(front==-1)
                return true;
            for(tail=tail-1; tail>head; tail--){
                char ch= s.charAt(tail);
                if((ch>='0')&&(ch<='9')){
                    back= ch;
                    break;
                }else if((ch>='a')&&(ch<='z')){
                    back= ch;
                    break;
                }else if((ch>='A')&&(ch<='Z')){
                    back= ch-'A'+'a';
                    break;
                }  
            }
            if(back==-1)
                return true;
            
            if(front!=back)
                return false;
        }
        return true;
    }
}
