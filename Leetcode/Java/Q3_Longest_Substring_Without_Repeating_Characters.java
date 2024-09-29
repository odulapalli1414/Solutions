import java.util.*; // Importing the necessary Java utilities, such as HashMap

class Solution {
    // Method to find the length of the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        // Variable to store the maximum length of the substring found
        int maxLength = 0;
        // 'left' pointer to define the start of the sliding window
        int left = 0;

        // HashMap to store the last occurrence index of each character in the string
        HashMap<Character, Integer> charIdx = new HashMap<>();

        // Loop through the string using the 'right' pointer as the end of the sliding window
        for (int right = 0; right < s.length(); right++) {
            // Get the current character at the 'right' position
            char currentChar = s.charAt(right);

            // If the current character has already been seen and its index is within the window
            if (charIdx.containsKey(currentChar) && charIdx.get(currentChar) >= left) {
                // Move the 'left' pointer just past the last occurrence of the repeating character
                left = charIdx.get(currentChar) + 1;
            }

            // Update the index of the current character to its latest position
            charIdx.put(currentChar, right);

            // Calculate the length of the current substring (right - left + 1)
            // and update maxLength if the current substring is longer than the previous longest
            maxLength = Math.max(maxLength, right - left + 1);
        }

        // Return the length of the longest substring without repeating characters
        return maxLength;
    }
}
