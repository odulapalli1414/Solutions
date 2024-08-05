class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Initialize ans to 0
        ans = 0
        
        # Iterate over each number in the list
        for i in range(len(nums)):
            # XOR the current number with ans
            ans = ans ^ nums[i]
        
        # Return the result which is the single number
        return ans
