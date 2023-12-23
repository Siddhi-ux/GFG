import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        int freq = n / k; // Minimum frequency required
        
        // Create a HashMap to store the frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0; // Counter for elements appearing more than n/k times
        
        // Iterate through the frequency map to count elements with required frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > freq) {
                count++;
            }
        }
        
        return count;
    }
}
