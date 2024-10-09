class Solution(object):
    def checkString(self, s):
        """
        This function checks if all 'a' characters appear before 'b' characters in the string.
        It returns False if any 'b' is followed by 'a', otherwise it returns True.
        """
        # Iterate through the string up to the second-last character
        for i in range(0, len(s) - 1):
            # If a 'b' is followed by an 'a', return False
            if s[i] == 'b' and s[i + 1] == 'a':
                return False
        
        # If no invalid 'ba' pair is found, return True
        return True
