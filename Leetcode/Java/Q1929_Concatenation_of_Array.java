import java.util.*;

class Solution {
    /**
     * Concatenates the given array with itself.
     * 
     * @param nums The input array to be concatenated.
     * @return A new array that is the concatenation of the input array with itself.
     */
    public int[] getConcatenation(int[] nums) {
        // Create a result array of size twice the length of the input array
        int res[] = new int[2 * nums.length];
        
        // Fill the result array by cycling through the input array
        for(int i = 0; i < res.length; i++) {
            // Use modulo operation to wrap around the input array indices
            res[i] = nums[i % nums.length];
        }

        return res; // Return the concatenated result array
    }
}
