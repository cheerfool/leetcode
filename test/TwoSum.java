package test;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] index= new int[2];
        int n=numbers.length;
        for(int i=0; i<n-1; i++){
            if(numbers[i]>target)
                continue;
            for(int j=i+1; j<n; j++){
                int sum = numbers[i]+numbers[j];
                if(sum==target){
                    index[0]=i+1;
                    index[1]=j+1;
                    return index;
                }
            }
        }
        return index;
    }
}
