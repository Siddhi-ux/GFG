class Solution {
    static int gameOfXor(int N, int[] A) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            int totalSubarrays = (i + 1) * (N - i);
            if (totalSubarrays % 2 == 1) {
                // If the number of subarrays is odd, the XOR will contribute to the result
                result ^= A[i];
            }
        }
        return result;
    }
}
