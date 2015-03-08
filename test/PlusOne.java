package test;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int sign= 0;
        int n=digits.length;
        for(int i=n-1; i>=0; i--){
            digits[i]++;
            if(digits[i]>9)
                digits[i]=digits[i]%10;
            else
                break;
            if(i==0)
                sign=1;
        }
        if(sign==1){
            int[] newDigits= new int[n+1];
            newDigits[0]=1;
            for(int i=0; i<n; i++)
                newDigits[i+1]=digits[i];
            return newDigits;
        }else{
            return digits;
        }
    }
}
