class Solution {
    long countWays(int n, int k) {
        long mod = 1000000007;
        long ans = 1;
        long prev = 1;
        
        for (int i = 1; i < n; i++) {
            long temp = (k - 1) * ans % mod;
            ans = (prev + temp) % mod;
            prev = temp;
        }
        
        return (ans * k) % mod;
    }
}
