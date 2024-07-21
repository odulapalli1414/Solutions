class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Create a list to count the occurrences of each number from 0 to 100
        count = []
        for i in range(101):
            count.append(0)

        ans = 0
        # Iterate through the list of numbers
        for i in range(len(nums)):
            # Add the current count of the number to the answer
            ans += count[nums[i]]
            # Increment the count of the current number
            count[nums[i]] += 1
        return ans
