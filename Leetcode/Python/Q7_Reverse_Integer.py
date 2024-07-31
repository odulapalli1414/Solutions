class Solution(object):
    def reverse(self, x):
        """
        Reverse digits of an integer x.
        
        :type x: int
        :rtype: int
        """
        # Handle negative numbers
        negative = x < 0
        x = abs(x)
        
        # Reverse the digits
        reversed_x = int(str(x)[::-1])
        
        # Check for 32-bit signed integer overflow
        if reversed_x > 2**31 - 1:
            return 0
        
        # Apply the original sign
        if negative:
            reversed_x = -reversed_x
        
        return reversed_x
