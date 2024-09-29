import java.util.HashMap;

public class HarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Populate the HashMap with the count of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxLength = 0;

        // Iterate through the keys in the map
        for (int num : map.keySet()) {
            // Check if the number + 1 exists in the map (i.e., a harmonious pair)
            if (map.containsKey(num + 1)) {
                // Calculate the length of the harmonious subsequence
                int currentLength = map.get(num) + map.get(num + 1);
                // Update maxLength if the current subsequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        // Return the maximum length found
        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(nums1));  // Output: 5

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(findLHS(nums2));  // Output: 2

        int[] nums3 = {1, 1, 1, 1};
        System.out.println(findLHS(nums3));  // Output: 0
    }
}
