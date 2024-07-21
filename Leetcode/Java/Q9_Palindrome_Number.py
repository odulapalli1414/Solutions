class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        String str = Integer.toString(x);

        // Create a StringBuilder from the string
        StringBuilder new_str = new StringBuilder(str);
        // Reverse the StringBuilder
        new_str.reverse();

        // Compare the original string with the reversed string
        if (str.equals(new_str.toString())) {
            // If they are equal, the number is a palindrome
            return true;
        } else {
            // If they are not equal, the number is not a palindrome
            return false;
        }
    }
}
