class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();  // Length of the string
        int m = p.length();  // Length of the pattern

        // DP table where dp[i][j] indicates whether s[0:i] matches p[0:j]
        boolean[][] dp = new boolean[n+1][m+1];

        // Base case: empty string matches with empty pattern
        dp[0][0] = true;

        // If the pattern is empty but the string is not, there's no match
        for(int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }

        // Handle patterns like "a*", ".*", "a*b*", etc.
        for(int j = 1; j < m + 1; j++) {
            if(p.charAt(j - 1) == '*') {
                // '*' can match zero occurrences of the preceding element
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the DP table
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                // Case 1: Characters match or pattern has '.' (matches any single character)
                if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // Case 2: Pattern has '*'
                else if(p.charAt(j - 1) == '*') {
                    // Case 2a: '*' represents zero occurrences of the preceding element
                    dp[i][j] = dp[i][j - 2];

                    // Case 2b: '*' represents one or more occurrences of the preceding element
                    if(p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
