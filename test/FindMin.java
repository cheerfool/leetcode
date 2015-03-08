package test;

public class FindMin {
    public int findMin(int[] num) {
        if(num==null || num.length==0)
            return 0;
        int len= num.length;
        int low= 0, high= len-1;
        while(high-low>1){
            if(num[low]<=num[high])
                return num[low];
            int pivot= low+(high-low)/2;
            if(num[pivot+1]<num[pivot])
                return num[pivot+1];
            if(num[pivot-1]>num[pivot])
                return num[pivot];
            
            if(num[low]<num[pivot])
                low= pivot;
            else
                high= pivot;
        }
        return num[low]<num[high]?num[low]:num[high];
    }
}
