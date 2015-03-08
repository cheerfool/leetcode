package test;

public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int C[]= new int[m+n];
        int pa=0, pb=0;
        while((pa<m)||(pb<n)){
            if(pa==m){
                C[pa+pb]=B[pb];
                pb++;
            }else if(pb==n){
                C[pa+pb]=A[pa];
                pa++;
            }else{
                if(A[pa]<=B[pb]){
                    C[pa+pb]=A[pa];
                    pa++;
                }else{
                    C[pa+pb]=B[pb];
                    pb++;
                }   
            }
        }
        for(int i=0; i<m+n; i++)
            A[i]=C[i];
    }
}
    
