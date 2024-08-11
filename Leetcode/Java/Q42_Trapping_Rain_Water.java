class Solution {
    // Helper method to calculate the left and right max boundaries for each element in the array
    public static void calBoundaries(int[] nums, int[] leftMaxBoundary, int[] rightMaxBoundary){
        // Calculate the left max boundary for each element
        // leftMaxBoundary[i] stores the maximum height to the left of index i (including itself)
        leftMaxBoundary[0] = nums[0];  // The first element is its own left max boundary
        for(int i = 1; i < nums.length; i++){
            leftMaxBoundary[i] = Math.max(nums[i], leftMaxBoundary[i - 1]);
            // Update leftMaxBoundary by comparing the current element with the previous left max
        }

        // Calculate the right max boundary for each element
        // rightMaxBoundary[i] stores the maximum height to the right of index i (including itself)
        rightMaxBoundary[nums.length - 1] = nums[nums.length - 1];  // The last element is its own right max boundary
        for(int i = nums.length - 2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(nums[i], rightMaxBoundary[i + 1]);
            // Update rightMaxBoundary by comparing the current element with the next right max
        }
    }

    // Method to calculate the amount of trapped water
    public int trap(int[] height) {
        // Arrays to store the left and right maximum boundaries for each element
        int leftMaxBoundary[] = new int[height.length];
        int rightMaxBoundary[] = new int[height.length];

        // Calculate the boundaries
        calBoundaries(height, leftMaxBoundary, rightMaxBoundary);

        int sum = 0;  // Variable to store the total trapped water
        // Iterate through each element in the height array
        for(int i = 0; i < height.length; i++){
            // The water trapped at index i is determined by the minimum of the two boundaries minus the height at index i
            int w = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            sum += w - height[i];  // Add the trapped water at index i to the total sum
        }
        
        return sum;  // Return the total amount of trapped water
    }
}
