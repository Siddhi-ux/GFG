class Solution {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        long maxSum = 0;
        long currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum += Arr.get(i);

            // If the current window size is greater than K,
            // remove the element from the beginning of the window
            if (i >= K) {
                currentSum -= Arr.get(i - K);
            }

            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
