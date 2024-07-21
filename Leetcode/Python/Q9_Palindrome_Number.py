class Solution(object):
    def isPalindrome(self, x):
        # Convert the integer to a string
        string = str(x)
        
        # Check if the string reads the same forwards and backwards
        if string == string[::-1]:  # string[::-1] is the reversed string
            return True
        else:
            return False
