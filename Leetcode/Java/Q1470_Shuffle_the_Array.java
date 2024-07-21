// Direct implementation
class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Create a new array to hold the shuffled result
        int[] res = new int[2 * n];
        
        // Loop through the first half of the input array
        for (int i = 0; i < n; i++) {
            // Place the element from the first half of nums into the even indices of the result array
            res[2 * i] = nums[i];
            
            // Place the element from the second half of nums into the odd indices of the result array
            res[2 * i + 1] = nums[i + n];
        }
        
        // Return the shuffled result array
        return res;
    }
}


// Detailed Code
class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Create an array to store the shuffled result
        int res[] = new int[nums.length];
        
        // Create arrays to store the two halves of nums
        int first_half[] = new int[n];
        int second_half[] = new int[n];

        // Populate the first_half array with the first n elements of nums
        for(int i = 0; i < n; i++) {
            first_half[i] = nums[i];
        }

        // Populate the second_half array with the next n elements of nums
        for(int i = n; i < nums.length; i++) {
            second_half[i - n] = nums[i];
        }

        // Initialize pointers for the first and second halves
        int odd = 0;  // Pointer for the second_half array
        int even = 0; // Pointer for the first_half array
        int ind = 0;  // Pointer for the result array

        // Merge the two halves into the result array
        while(odd < n && even < n) {
            if(ind % 2 == 0) {
                // Place element from first_half at even indices of res
                res[ind] = first_half[even];
                ind++;
                even++;
            }
            if(ind % 2 != 0) {
                // Place element from second_half at odd indices of res
                res[ind] = second_half[odd];
                ind++;
                odd++;
            }
        }

        // Return the shuffled array
        return res;
    }
}
