package test;

import java.util.ArrayList;

public class MinStack {
    ArrayList<Integer> stack= new ArrayList<Integer>();
    int tail=-1;
    int min=0;
    int minIndex=-1;
    
    public void push(int x) {
        stack.add(x);
        tail++;
        if((tail==0)||(x<min)){
            min= x;
            minIndex= tail;
        }
    }

    public void pop() {
        if(tail>-1){
            stack.remove(tail);
            tail--;
            if((tail+1)==minIndex)
                setMin();
        }
    }

    public int top() {
        if(tail>-1)
            return stack.get(tail).intValue();
        else
            return 0;
    }

    public int getMin() {
        return min;
    }
    
    void setMin(){
        if(tail<0){
            min=0;
            minIndex=-1;
        }else{
            min=stack.get(0);
            minIndex=0;
            for(int i=1; i<tail+1; i++){
                int temp= stack.get(i);
                if(temp<min){
                    min= temp;
                    minIndex= i;
                }
            }
        }
    }
}
