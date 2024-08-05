class Solution(object):
    def searchInsert(self, arr, target):
        """
        :type arr: List[int]
        :type target: int
        :rtype: int
        """
        # Initialize start index and end index
        si = 0
        ei = len(arr) - 1

        # Perform binary search
        while si <= ei:
            # Calculate the middle index
            mid = si + (ei - si) // 2
            
            # Check if the middle element is equal to the target
            if arr[mid] == target:
                return mid
            
            # If the target is greater than the middle element, search in the right half
            if arr[mid] < target:
                si = mid + 1
            # If the target is less than the middle element, search in the left half
            else:
                ei = mid - 1

        # If target is not found, si will be the insert position
        return si
