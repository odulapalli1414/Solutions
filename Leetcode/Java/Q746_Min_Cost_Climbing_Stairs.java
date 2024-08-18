class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        // Initialize a dp array of size n+1 to store the minimum cost to reach each step.
        int dp[] = new int[n+1];
        
        // Base cases: the cost to reach the first and second steps is just the cost of those steps.
        dp[0] = cost[0];
        dp[1] = cost[1];

        // Iterate over the steps starting from the third step up to the n+1th step.
        for(int i = 2; i <= n; i++){
            // If we are at the final step (index n), there is no cost, otherwise, use cost[i].
            int curr = i == n ? 0 : cost[i];

            // The cost to reach the current step is the current step's cost plus the minimum
            // of the costs to reach the two previous steps (either from dp[i-1] or dp[i-2]).
            dp[i] = curr + Math.min(dp[i-1], dp[i-2]);
        }
        
        // The minimum cost to reach the top of the stairs is stored in dp[n].
        return dp[n];
    }
}
