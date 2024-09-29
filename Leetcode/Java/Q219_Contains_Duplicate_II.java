import java.util.HashMap;

public class Q219_Contains_Duplicate_II {

    public static boolean solution(int[] nums, int k) {
        // HashMap to store the most recent index of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array with the right pointer
        for (int right = 0; right < nums.length; right++) {
            // If the element is already in the map
            if (map.containsKey(nums[right])) {
                // Check if the absolute difference of indices is less than or equal to k
                if (right - map.get(nums[right]) <= k) {
                    return true;
                }
            }
            // Update the map with the current index of the element
            map.put(nums[right], right);
        }
        // Return false if no such pair is found
        return false;
    }
}
