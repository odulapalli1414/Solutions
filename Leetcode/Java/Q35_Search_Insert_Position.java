// Approach 1
class Solution {
    public int searchInsert(int[] arr, int target) {
        // Initialize the start index (si) and end index (ei)
        int si = 0, ei = arr.length - 1;
        // Initialize the result index
        int res = 0;

        // Check if the target is less than the first element in the array
        if (target < arr[0]) {
            return 0; // Return 0 since the target should be inserted at the beginning
        }
        // Check if the target is greater than the last element in the array
        if (target > arr[arr.length - 1]) {
            return arr.length; // Return the length of the array since the target should be inserted at the end
        }

        // Perform binary search to find the target or the insert position
        while (si <= ei) {
            // Calculate the mid index to avoid overflow
            int mid = si + (ei - si) / 2;

            // If the target is found at mid, set result to mid and break the loop
            if (arr[mid] == target) {
                res = mid;
                break;
            }

            // Check if target should be inserted before mid
            if (arr[mid] > target && arr[mid - 1] < target) {
                res = mid;
                break;
            }

            // Check if target should be inserted after mid
            if (arr[mid] < target && arr[mid + 1] > target) {
                res = mid + 1;
                break;
            }

            // Adjust the search range based on the comparison with target
            if (arr[mid] < target) {
                si = mid + 1; // Search in the right half
            } else {
                ei = mid - 1; // Search in the left half
            }
        }
        return res; // Return the insert position
    }
}


// Approach 2
class Solution {
    public int searchInsert(int[] arr, int target) {
        // Initialize the start index (si) and end index (ei) for the binary search
        int si = 0, ei = arr.length - 1;

        // Perform binary search
        while (si <= ei) {
            // Calculate the middle index to avoid overflow
            int mid = si + (ei - si) / 2;

            // If the middle element is the target, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If the middle element is less than the target,
            // narrow the search to the right half by adjusting the start index
            if (arr[mid] < target) {
                si = mid + 1;
            } 
            // If the middle element is greater than the target,
            // narrow the search to the left half by adjusting the end index
            else {
                ei = mid - 1;
            }
        }

        // If the target is not found, return the index where it would be inserted
        return si;
    }
}
