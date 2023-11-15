import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static String betterString(String str1, String str2) {
        int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        // Compare counts and return the better string
        return (count1 >= count2) ? str1 : str2;
    }

    public static int countDistinctSubsequences(String str) {
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];

            if (last.containsKey(str.charAt(i - 1))) {
                dp[i] -= dp[last.get(str.charAt(i - 1)) - 1];
            }

            last.put(str.charAt(i - 1), i);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Getting the better string
        String result = betterString(str1, str2);

        // Output the result
        System.out.println("Better String: " + result);

        scanner.close();
    }
}
