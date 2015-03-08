package test;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
            
        if(reverseNature(x)==x)
            return true;
        else
            return false;
    }
    
    public int reverseNature(int x){
        int y=0;
        while(x>0){
            if((Integer.MAX_VALUE-x%10)/10<y){
                return -1;
            }else{
                y= y*10 + x%10;
                x= x/10;
            }
        }
        return y;
    }
}
