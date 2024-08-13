class Solution {
    public int search(int[] nums, int target) {
        // Initialize left pointer (lp) to the start of the array
        int lp = 0;
        
        // Initialize right pointer (rp) to the end of the array
        int rp = nums.length - 1;

        // Continue searching while the left pointer is less than or equal to the right pointer
        while (lp <= rp) {
            // Calculate the mid-point of the current search range to avoid potential overflow
            int mid = lp + (rp - lp) / 2;
            
            // If the target value is found at the mid-point, return its index
            if (nums[mid] == target) {
                return mid;
            }
            // If the target value is less than the mid-point value, adjust the right pointer to search in the left half
            else if (nums[mid] > target) {
                rp = mid - 1;
            }
            // If the target value is greater than the mid-point value, adjust the left pointer to search in the right half
            else {
                lp = mid + 1;
            }
        }
        
        // If the target value is not found in the array, return -1
        return -1;
    }
}
