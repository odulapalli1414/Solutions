class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        # Remove all spaces from the string (this step is redundant since spaces
        # will be ignored in the next step anyway)
        s = s.replace(" ", "")  
        
        # Convert the string to lowercase to ensure case insensitivity
        s = s.lower()

        # Keep only alphanumeric characters (letters and digits)
        s2 = [char for char in s if char.isalnum()]

        # Check if the cleaned string is equal to its reverse
        return s2 == s2[::-1]  
