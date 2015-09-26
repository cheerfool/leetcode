package test;

import java.util.HashSet;
import java.util.Set;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(set.contains(target - nums[i])){
                index[1] = i+1;
                for(int j=0; j<i; j++){
                    if(nums[j] == target - nums[i]){
                        index[0] = j+1;
                        return index;
                    }
                }
            }
            set.add(nums[i]);
        }
        return index;
    }
}
