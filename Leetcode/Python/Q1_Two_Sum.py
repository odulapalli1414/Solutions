class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # Create a dictionary to store the numbers we have seen and their indices
        map = {}
        
        # Iterate over the list of numbers along with their indices
        for i, num in enumerate(nums):
            # Calculate the difference between the target and the current number
            diff = target - num

            # Check if the difference is already in the dictionary
            if diff in map:
                # If it is, return the index of the difference and the current index
                return map[diff], i
            
            # Otherwise, store the current number and its index in the dictionary
            map[num] = i
