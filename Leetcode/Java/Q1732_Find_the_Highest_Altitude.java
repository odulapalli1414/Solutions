class Solution {
    public int largestAltitude(int[] gain) {
        // Create an array to store the prefix sums. The size is gain.length + 1 
        // to include the initial altitude of 0 at the start.
        int[] prefixSum = new int[gain.length + 1];
        // The initial altitude is 0.
        prefixSum[0] = 0;

        // Variable to track the maximum altitude encountered.
        int maxHeight = 0;

        // Calculate the prefix sums and update the maximum altitude.
        for (int i = 1; i < prefixSum.length; i++) {
            // Add the current gain to the previous altitude to get the current altitude.
            prefixSum[i] = gain[i - 1] + prefixSum[i - 1];
            // Update maxHeight if the current altitude is higher than the previous maxHeight.
            maxHeight = Math.max(maxHeight, prefixSum[i]);
        }

        // Return the highest altitude reached.
        return maxHeight;
    }
}
