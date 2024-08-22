class Solution {
    public int tribonacci(int n) {
        // Base cases: return the value of n for 0 and 1, since T(0) = 0, T(1) = 1.
        if (n == 0 || n == 1) {
            return n;
        }
        
        // Base case: return 1 for n=2, since T(2) = 1.
        if (n == 2) {
            return 1;
        }

        // Create an array dp to store the Tribonacci numbers up to n.
        int[] dp = new int[n + 1];
        
        // Initialize the first three values of the Tribonacci sequence.
        dp[0] = 0; // T(0) = 0
        dp[1] = 1; // T(1) = 1
        dp[2] = 1; // T(2) = 1

        // Fill the dp array with Tribonacci numbers from T(3) to T(n).
        for (int i = 3; i < dp.length; i++) {
            // T(i) = T(i-1) + T(i-2) + T(i-3)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // Return the nth Tribonacci number.
        return dp[n];
    }
}
