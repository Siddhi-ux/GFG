class Solution{
    static int findWinner(int n, int A[]){
        int xor = 0;
        
        // Calculating XOR of all elements in the array
        for (int num : A) {
            xor ^= num;
        }
        
        // If XOR is already zero, player 1 wins
        if (xor == 0) {
            return 1; // Player 1 wins
        } else {
            // If number of elements is even, player 1 wins
            if (n % 2 == 0) {
                return 1; // Player 1 wins
            } else {
                return 2; // Player 2 wins
            }
        }
    }
}
