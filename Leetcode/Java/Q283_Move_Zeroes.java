class Solution {
    public void moveZeroes(int[] nums) {
        int q = 0;  // Pointer to track the position to place the next non-zero element

        // Traverse the array and move non-zero elements to the front
        for (int p = 0; p < nums.length; p++) {
            if (nums[p] != 0) {
                nums[q] = nums[p];  // Place non-zero element at the position indicated by q
                q++;  // Increment q to point to the next position for a non-zero element
            }
        }

        // Fill the remaining positions with zeros
        for (int i = q; i < nums.length; i++) {
            nums[i] = 0;  // Set the remaining elements to 0
        }
    }
}
