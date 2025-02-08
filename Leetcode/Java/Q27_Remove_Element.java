
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position of non-val elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, keep it in the array
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the non-val element to index k
                k++; // Increment k to store the next non-val element
            }
        }

        // k represents the count of elements not equal to val
        return k;
    }
}
