public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        // DP table: dp[i][j] will be true if s[i...j] is a palindrome
        boolean[][] dp = new boolean[n][n];

        int maxLength = 1; // Length of the longest palindrome found
        int start = 0;     // Starting index of the longest palindrome found

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for substrings of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1; // Ending index of the current substring

                // Check if the current substring s[i...j] is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "babad";
        System.out.println(longestPalindrome(s1)); // Output: "bab" or "aba"

        String s2 = "cbbd";
        System.out.println(longestPalindrome(s2)); // Output: "bb"
    }
}
