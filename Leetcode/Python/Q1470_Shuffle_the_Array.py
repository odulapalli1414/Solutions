class Solution(object):
    def shuffle(self, nums, n):
        """
        Shuffles the given list 'nums' into a new list where the first 'n' elements 
        and the last 'n' elements are interleaved.

        :type nums: List[int]  # The list containing the elements to be shuffled.
        :type n: int           # The integer representing the number of elements in each half.
        :rtype: List[int]     # The shuffled list as the output.
        """
        res = []  # Initialize an empty list to store the shuffled result.

        # Iterate through the first 'n' elements of 'nums'
        for i in range(n):
            res.append(nums[i])      # Add the i-th element from the first half of 'nums' to 'res'.
            res.append(nums[i + n])  # Add the i-th element from the second half of 'nums' to 'res'.

        return res  # Return the shuffled list.
