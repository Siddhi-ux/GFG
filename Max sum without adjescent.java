class Solution {
    int findMaxSum(int arr[], int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return arr[0];
        }

        int include = arr[0]; // Maximum sum including the current element
        int exclude = 0; // Maximum sum excluding the current element

        for (int i = 1; i < n; i++) {
            int temp = include;
            include = Math.max(exclude + arr[i], include); // Update include by considering current element or excluding it
            exclude = Math.max(temp, exclude); // Update exclude using the previous value of include
        }

        return Math.max(include, exclude); // Return the maximum sum
    }
}
