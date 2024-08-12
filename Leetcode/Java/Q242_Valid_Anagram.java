class Solution {
    public boolean isAnagram(String s, String t) {
        // Create an array to store the frequency of each character (assuming only lowercase English letters)
        int[] freq = new int[26];

        // Iterate over each character in the first string 's'
        for(int i = 0; i < s.length(); i++) {
            // Get the current character
            char ch = s.charAt(i);
            // Increment the frequency of the character in the 'freq' array
            freq[ch - 'a']++;
        }

        // Iterate over each character in the second string 't'
        for(int i = 0; i < t.length(); i++) {
            // Get the current character
            char ch = t.charAt(i);
            // Decrement the frequency of the character in the 'freq' array
            freq[ch - 'a']--;
        }

        // Check if all frequencies are zero (indicating both strings are anagrams)
        for(int i = 0; i < freq.length; i++) {
            // If any frequency is not zero, the strings are not anagrams
            if(freq[i] != 0) {
                return false;
            }
        }
        
        // If all frequencies are zero, the strings are anagrams
        return true;
    }
}
