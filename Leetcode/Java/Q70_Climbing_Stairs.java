class Solution {
    public int climbStairs(int n) {
        // Create an array dp where dp[i] will store the number of ways to reach the ith step
        int[] dp = new int[n + 1];
        
        // There is one way to stay at the ground (step 0), by doing nothing
        dp[0] = 1;
        
        // There is one way to reach the first step, by taking one step
        dp[1] = 1;
        
        // Iterate from step 2 to step n to fill the dp array
        for (int i = 2; i <= n; i++) {
            // The number of ways to reach the ith step is the sum of ways to reach the (i-1)th step and (i-2)th step
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        // Return the number of ways to reach the nth step
        return dp[n];
    }
}
