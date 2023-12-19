class Solution {
    // Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n) {
        // Perform XOR operation between m and n
        int xor = m ^ n;
        
        // If both m and n are the same, return -1
        if (xor == 0) {
            return -1;
        }
        
        // Find the position of the rightmost set bit (1) in the XOR result
        int position = 1;
        while ((xor & 1) == 0) {
            xor = xor >> 1;
            position++;
        }
        
        return position;
    }
}
