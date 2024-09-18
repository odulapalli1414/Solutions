class Solution(object):
    def largestNumber(self, nums):
        # Convert each number in the list to a string so we can concatenate them later.
        nums = list(map(str, nums))
    
        # Sort the list of strings using a custom key.
        # The key for sorting is the string repeated 10 times (x*10).
        # This ensures the relative order between numbers is determined by their first few digits.
        # The sorting is done in reverse (descending) order to form the largest possible number.
        nums.sort(key=lambda x: x*10, reverse=True)
        
        # Join the sorted list of numbers into a single string.
        largest_num = ''.join(nums)

        # Handle the edge case where the largest number is '0' (e.g., when all numbers are 0).
        # If the first character is '0', return '0' instead of something like '000'.
        return '0' if largest_num[0] == '0' else largest_num
