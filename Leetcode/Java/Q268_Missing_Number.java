class Solution {
    public int missingNumber(int[] nums) {
        // Get the length of the array
        int n = nums.length;

        // Initialize result to n, which is the upper bound of the range [0, n]
        int result = n;

        // Iterate through the array, using XOR to cancel out all numbers except the missing one
        for (int i = 0; i < n; i++) {
            // XOR the current result with both the index 'i' and the value at 'nums[i]'
            result = result ^ i ^ nums[i];
        }

        // Return the result, which will be the missing number
        return result;
    }
}
