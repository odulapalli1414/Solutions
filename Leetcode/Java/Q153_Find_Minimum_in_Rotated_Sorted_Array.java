class Solution {
    public int findMin(int[] nums) {
        // If the array is already sorted (no rotation), return the first element
        if (nums[0] <= nums[nums.length - 1]) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        // Perform binary search to find the minimum element
        while (left < right) {
            int mid = (left + right) / 2;

            // If mid element is greater than or equal to the first element,
            // it means the minimum element is in the right half.
            if (nums[0] <= nums[mid]) {
                left = mid + 1;
            } 
            // Otherwise, the minimum is in the left half (including mid).
            else {
                right = mid;
            }
        }

        // The left pointer now points to the minimum element
        return nums[left];
    }
}
