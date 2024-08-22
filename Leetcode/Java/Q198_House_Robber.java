class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // If there's only one house, return its value.
        if (n == 1) {
            return nums[0];
        }
        // If there are no houses, return 0.
        else if (n == 0) {
            return 0;
        }
        // If there are two houses, return the maximum of the two.
        else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        // Create a dp array to store the maximum amount of money that can be robbed up to each house.
        int dp[] = new int[nums.length + 1];
        
        // Initialize the dp array with base cases.
        dp[0] = nums[0]; // Rob the first house.
        dp[1] = nums[1]; // Rob the second house.
        dp[2] = nums[2] + nums[0]; // Rob the third house and add the value from the first house.

        // Fill the dp array with the maximum amount that can be robbed up to each house.
        for (int i = 3; i < nums.length; i++) {
            // For each house, choose the maximum between robbing this house and skipping one or two houses before it.
            dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
        }

        // The result is the maximum value of robbing up to the last or second-to-last house.
        return Math.max(dp[n - 1], dp[n - 2]);
    }
}
