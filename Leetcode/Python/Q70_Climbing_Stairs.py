class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        # Initialize a list to store the number of ways to reach each step
        dp = []
        
        # Base cases: there is 1 way to climb 0 steps and 1 way to climb 1 step
        dp.append(1)  # dp[0] = 1 (1 way to stay at the ground)
        dp.append(1)  # dp[1] = 1 (1 way to climb 1 step)

        # Compute the number of ways to climb to each step from 2 up to n
        # dp[i] is the sum of the ways to climb to the two previous steps (dp[i-1] + dp[i-2])
        for i in range(2, n + 1):
            dp.append(dp[i-1] + dp[i-2])

        # Return the number of ways to climb n steps
        return dp[n]
