class Solution {
    public int maxArea(int[] height) {
        // Get the length of the height array
        int n = height.length;
        
        // Initialize max_volume to the smallest possible integer value
        // This will store the maximum area (volume) found
        int max_volume = Integer.MIN_VALUE;
        
        // Initialize two pointers, one at the beginning (lp) and one at the end (rp) of the array
        int lp = 0;
        int rp = n - 1;

        // Continue looping until the two pointers meet
        while (lp != rp) {
            // Calculate the width between the two pointers
            int width = rp - lp;
            
            // Calculate the height (length) of the container, which is the smaller of the two heights
            int length = Math.min(height[lp], height[rp]);
            
            // Calculate the current area (volume) formed between the two pointers
            int volume = width * length;
            
            // Update max_volume if the current volume is greater than the previous maximum
            if (max_volume < volume) {
                max_volume = volume;
            }

            // Move the pointer that points to the shorter line
            // This is because the area is limited by the shorter line, 
            // so moving the pointer might give a chance to find a larger area
            if (height[lp] < height[rp]) {
                lp++; // Move left pointer to the right
            } else {
                rp--; // Move right pointer to the left
            }
        }

        // Return the maximum volume found
        return max_volume;
    }
}
