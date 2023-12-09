import java.util.*;

class Solution {
    static int smithNum(int n) {
        // Function to calculate sum of digits of a number
        int digitSum = sumOfDigits(n);
        
        // Factorize the number into its prime factors
        List<Integer> primeFactors = primeFactors(n);
        
        // Calculate sum of digits of prime factors
        int primeFactorSum = 0;
        for (int factor : primeFactors) {
            primeFactorSum += sumOfDigits(factor);
        }
        
        // Compare the sums
        if (digitSum == primeFactorSum && primeFactors.size() > 1) {
            return 1; // It's a Smith number
        } else {
            return 0; // It's not a Smith number
        }
    }
    
    // Function to calculate sum of digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    // Function to find prime factors of a number
    static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
