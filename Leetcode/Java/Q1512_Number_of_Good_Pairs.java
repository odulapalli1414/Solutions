class Solution {
    public int numIdenticalPairs(int[] nums) {
        // Array to count occurrences of each number (assuming numbers range from 0 to 100)
        int[] count = new int[101];
        // Variable to store the total number of good pairs
        int ans = 0;
        
        // Iterate through each number in the input array
        for (int x : nums) {
            // Increment the number of good pairs by the current count of 'x'
            // The count[x] represents the number of times 'x' has appeared before
            // Therefore, each of those appearances forms a good pair with the current 'x'
            ans += count[x]++;
        }
        
        // Return the total number of good pairs
        return ans;
    }
}
