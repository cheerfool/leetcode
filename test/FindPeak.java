package test;

public class FindPeak {
    public int findPeakElement(int[] num) {
        if(num==null || num.length<2)
            return 0;
        int len= num.length;
        if(num[0]>num[1])
            return 0;
        if(num[len-1]>num[len-2])
            return len-1;
        
        int left=1, right=len-2;
        while(right>left){
            int mid= left+(right-left)/2;
            if(num[mid]<num[mid+1]){
                left= mid+1;
            }else{
                if(num[mid]<num[mid-1])
                    right= mid-1;
                else
                    return mid;
            }
        }
        return left;
    }
}
