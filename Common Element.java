class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> res =new ArrayList<>();
        int i=0,k=0,j=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                res.add(A[i]);
                int c = A[i];
                while(i<n1 && A[i] == c) i++;
                while(j<n2 && B[j] == c) j++;
                while(k<n3 && C[k] == c) k++;
            }
            else if(A[i]<B[j] || A[i]<C[k]){
                i++;
            }else if(B[j]<A[i] || B[j]<C[k]){
                j++;
            }else{
                k++;
            }
        }
        return res;
    }
}
