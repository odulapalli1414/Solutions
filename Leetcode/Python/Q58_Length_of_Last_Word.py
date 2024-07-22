class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Split the string into a list of words using whitespace as the delimiter
        s = s.split()
        
        # Return the length of the last word in the list
        # s[len(s)-1] accesses the last word, and len() gets its length
        return len(s[len(s)-1])
