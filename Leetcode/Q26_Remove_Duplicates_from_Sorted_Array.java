class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize two pointers p and q
        int p = 0; // p is the slow pointer, tracking the position for unique elements
        int q = 1; // q is the fast pointer, used to scan through the array
        int count = 0; // This will keep track of the number of unique elements encountered
        
        // Iterate through the array as long as both pointers are within the array bounds
        while(p < nums.length && q < nums.length) {
            // If the elements at p and q are the same, increment q to skip the duplicate
            if(nums[p] == nums[q]) {
                q++;
            } 
            // If the elements are different, increment p and move the unique element from q to p
            else {
                p++; // Move p to the next position
                count++; // Increment the unique element count
                nums[p] = nums[q]; // Place the unique element found at q to the next position of p
            }
        }
        
        // Return the total number of unique elements, adding 1 to account for the 0-based index
        return count + 1;
    }
}
