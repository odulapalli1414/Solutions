class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        # Traverse the list from the last digit to the first
        for i in range(len(digits)-1, -1, -1):
            # If the current digit is not 9, simply increment the digit by 1 and return the list
            if digits[i] != 9:
                digits[i] += 1
                return digits
            # If the current digit is 9, set it to 0 (since 9+1 results in a carry over)
            digits[i] = 0

        # If all digits were 9, the result will be one additional digit
        # Create a new list with one extra digit, initialized to 0
        res = [0 for i in range(len(digits) + 1)]
        # Set the first digit to 1 (since the result of incrementing all 9s will be 100...0)
        res[0] = 1
        return res
