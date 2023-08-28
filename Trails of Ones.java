
class Solution{
    static int numberOfConsecutiveOnes(int N){
   
       
    int a[] = new int[N], b[] = new int[N];
    a[0] = b[0] = 1;

    for (int i = 1; i < N; i++) {
        a[i] = a[i - 1] + b[i - 1];
        b[i] = a[i - 1];
    }

    // Subtract the count of binary strings without consecutive 1's from 2^n
    return (1 << N) - a[N - 1] - b[N - 1];
}
}
