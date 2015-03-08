package test;

public class ClimbStairs0 {
    public int climbStairs(int n) {
        if(n<1)
            return 0;
        int ways= 0;
        for(int i=0; i<=n/2; i++)
            ways+= select(n-i, i);
        return ways;
    }
    
    public int select(int n, int i){
        int[] nums= new int[i];
        int[] denoms= new int[i];
        for(int j=0; j<i; j++){
            nums[j]= n-j;
            denoms[j]= i-j;
        }
        for(int j=0; j<i; j++){
            for(int k=0; k<i; k++){
                if(nums[k]%denoms[j]==0){
                    nums[k]/=denoms[j];
                    break;
                }
            }
        }
        int result=1;
        for(int num: nums)
            result*= num;
        return result;
    }
}
