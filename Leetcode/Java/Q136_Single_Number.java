class Solution {
    // Method to find the single number in an array where every other number appears twice
    public int singleNumber(int[] nums) {
        // Initialize the variable 'ans' to 0. This will store the result.
        int ans = 0;
        
        // Iterate through each number in the array
        for(int i = 0; i < nums.length; i++) {
            // Perform XOR operation between 'ans' and the current number
            // XOR of a number with itself is 0 and XOR of a number with 0 is the number itself
            ans = ans ^ nums[i];
        }
        
        // Return the single number which does not have a pair
        return ans;
    }
}
