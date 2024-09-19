class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize i to the last element of nums1's filled part
        int i = m - 1;
        // Initialize j to the last element of nums2
        int j = n - 1;
        // Initialize k to the last position of nums1 (total length m + n - 1)
        int k = m + n - 1;

        // Loop until all elements of nums2 are merged into nums1
        while (j >= 0) {
            // If nums1's current element is larger, place it in the final position
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Move nums1[i] to nums1[k]
                i--; // Decrease i to move to the next element in nums1
                k--; // Move to the next position in nums1
            }
            // Otherwise, place nums2's current element in the final position
            else {
                nums1[k] = nums2[j]; // Move nums2[j] to nums1[k]
                k--; // Move to the next position in nums1
                j--; // Decrease j to move to the next element in nums2
            }
        }
    }
}
