class Solution {
    static boolean findsum(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0 || set.contains(prefixSum))
                return true;

            set.add(prefixSum);
        }

        return false;
    }
}
