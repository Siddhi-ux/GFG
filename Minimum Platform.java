class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformsNeeded = 1;
        int result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
                if (platformsNeeded > result) {
                    result = platformsNeeded;
                }
            } else {
                platformsNeeded--;
                j++;
            }
        }

        return result;
    }
}

