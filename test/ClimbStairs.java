package test;

import java.util.HashMap;

public class ClimbStairs {
    HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
    ClimbStairs(){
        map.put(1,1);
        map.put(2,2);
    }
    public int climbStairs(int n) {
        if(n<1)
            return 0;
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            int stepsN= climbStairs(n-1)+climbStairs(n-2);
            map.put(n, stepsN);
            return stepsN;
        }
    }
}
