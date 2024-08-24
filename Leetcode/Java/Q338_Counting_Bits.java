class Solution {
    public int[] countBits(int n) {
        // Initialize an array to store the number of 1-bits for each number from 0 to n
        int[] dp = new int[n + 1];
        dp[0] = 0; // Base case: 0 has zero 1-bits

        // Iterate from 1 to n
        for (int i = 1; i < dp.length; i++) {
            // Calculate the number of 1-bits for the current number i
            // dp[i & (i-1)] gives the number of 1-bits in the number i with the lowest set bit turned off
            // Add 1 to account for the bit we just turned off
            dp[i] = dp[i & (i - 1)] + 1;
        }

        // Return the array containing the number of 1-bits for each number from 0 to n
        return dp;
    }
}
