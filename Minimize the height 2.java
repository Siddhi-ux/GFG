import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int result = arr[n - 1] - arr[0]; // Current difference between tallest and shortest

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);

            if (min < 0) // Skip negative values
                continue;

            result = Math.min(result, max - min);
        }

        return result;
    }
}
