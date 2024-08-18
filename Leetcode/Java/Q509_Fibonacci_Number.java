class Solution {
    public int fib(int n) {
        // Create a dynamic programming array to store Fibonacci numbers up to n
        int[] dp = new int[n + 1];
        
        // Base cases: return n if it's 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }
        
        // Initialize the first two Fibonacci numbers
        dp[0] = 0;
        dp[1] = 1;
        
        // Calculate the Fibonacci sequence up to n
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Each element is the sum of the two preceding elements
        }
        
        // Return the nth Fibonacci number
        return dp[n];
    }
}
