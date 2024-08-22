class Solution {
    public int pivotIndex(int[] nums) {
        // Create two arrays to store the cumulative sum from the left and the right.
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        // Initialize the first element of leftSum with the first element of nums.
        leftSum[0] = nums[0];
        // Initialize the last element of rightSum with the last element of nums.
        rightSum[rightSum.length - 1] = nums[rightSum.length - 1];

        // Calculate the cumulative sum from the left for each element in nums.
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }

        // Calculate the cumulative sum from the right for each element in nums.
        for (int j = rightSum.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j];
        }

        // Initialize the answer as -1, which will be returned if no pivot index is found.
        int ans = -1;

        // Iterate through the array to find the pivot index.
        for (int i = 0; i < nums.length; i++) {
            // Check if the left sum equals the right sum at the current index.
            if (leftSum[i] == rightSum[i]) {
                // If they are
