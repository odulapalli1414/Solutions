class Solution(object):
    def missingNumber(self, nums):
        # Get the length of the array
        n = len(nums)
        
        # Iterate through the range from 0 to n (inclusive)
        for i in range(0, n+1):
            # If the current number 'i' is present in the array, continue to the next iteration
            if i in nums:
                continue
            else:
                # If 'i' is not found in the array, return it as the missing number
                return i
