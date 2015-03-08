package test;

public class ReverseInteger {
/*    public int reverse(int x) {
        int flag=1;
        if(x<0){
            flag=-1;
            x=(-x);
        }
        int y=0;
        while(x>0){
            int digit=x%10;
            y=y*10+digit;
            x=(x-digit)/10;
        }
        return y*flag;
    }*/
/*    public int reverse(int x) {
        int rst = 0;
        while(x != 0){
            rst = rst * 10 + x % 10;
            x = x / 10;
        }
        return rst;
    }*/
    public int reverse(int x) {
        int y=0;
        while(x!=0){
            if((x>0)&&((Integer.MAX_VALUE-x%10)/10<y))
                return 0;
            if((x<0)&&((Integer.MIN_VALUE-x%10)/10>y))
                return 0;    
            y=y*10+x%10;
            x=x/10;
        }
        return y;
    }
}
