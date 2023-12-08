
class Solution
{
    public int minNumber(int arr[], int N)
    {
        // Initialize the sum of the array elements
        int sum = 0;
        // Loop through the array and add each element to the sum
        for (int num : arr) {
            sum += num;
        }
        // If the sum is already prime, return 0
        if (isPrime(sum)) {
            return 0;
        }
        // Otherwise, find the smallest positive number to be added to the sum to make it prime
        int min = 1;
        // Loop until the sum + min is prime
        while (!isPrime(sum + min)) {
            // Increment min by 1
            min++;
        }
        // Return the min number
        return min;
    }

    // Helper method to check if a number is prime or not
    public boolean isPrime(int n) {
        // If n is less than 2, it is not prime
        if (n < 2) {
            return false;
        }
        // If n is 2, it is prime
        if (n == 2) {
            return true;
        }
        // If n is even, it is not prime
        if (n % 2 == 0) {
            return false;
        }
        // Check for odd divisors from 3 to sqrt(n)
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            // If n is divisible by i, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // If no divisor is found, n is prime
        return true;
    }
}
