class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        # Merge both sorted arrays
        nums = nums1 + nums2
        # Sort the merged array
        nums.sort()

        # Calculate the total length of the merged array
        n = len(nums)

        # If the length is odd, return the middle element
        if n % 2 != 0:
            return float(nums[n // 2])
        else:
            # If the length is even, return the average of the two middle elements
            mid1 = nums[(n // 2) - 1]
            mid2 = nums[n // 2]
            return (mid1 + mid2) / 2.0


        # print(nums)

        
