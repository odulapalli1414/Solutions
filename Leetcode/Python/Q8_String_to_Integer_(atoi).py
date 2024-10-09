class Solution(object):
    def myAtoi(self, s):
        if len(s) == 0:
            return 0
        
        i = 0
        n = len(s)
        
        # Skip leading whitespace
        while i < n and s[i] == ' ':
            i += 1
        
        if i == n:
            return 0
        
        # Check the sign of the number
        sign = 1
        if s[i] == '-':
            sign = -1
            i += 1
        elif s[i] == '+':
            i += 1

        # Parse the digits and form the number
        result = 0
        while i < n and s[i].isdigit():
            result = result * 10 + int(s[i])
            i += 1
        
        # Apply the sign
        result *= sign

        # Clamp the result within the 32-bit signed integer range
        int_max = 2**31 - 1
        int_min = -2**31
        if result > int_max:
            return int_max
        elif result < int_min:
            return int_min
        else:
            return result
