package test;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int oldLength= A.length;
        int hit=0;
        int[] locations= new int[oldLength];
        for(int i=0; i<oldLength; i++){
            if(A[i]==elem){
                locations[hit]= i;
                hit++;
            }
        }
        int fill=0;
        for(int i=oldLength-1; i>=0 && fill<hit; i--){
            int num= A[i];
            if(num!=elem){
                if(i>locations[fill]){
                    A[locations[fill]]= num;
                    A[i]= elem;
                    fill++;
                }else{
                    break;
                }    
            }
        }
        return oldLength-hit;
    }
}
