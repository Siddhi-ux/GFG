class Solution {
    int countX(int L, int R, int X) {
        int count = 0;

        for (int i = L + 1; i < R; i++) {
            int number = i;

            while (number > 0) {
                int digit = number % 10;
                if (digit == X) {
                    count++;
                }
                number /= 10;
            }
        }

        return count;
    }
}
