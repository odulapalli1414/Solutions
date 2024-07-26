class Solution {
    public int mySqrt(int x) {
        // Initialize r to the value of x, using a long to avoid overflow issues
        long r = x;
        
        // Continue looping until r*r is no longer greater than x
        while (r * r > x) {
            // Update r using the Newton-Raphson method: r = (r + x / r) / 2
            r = (r + x / r) / 2;
        }
        
        // Cast r to an int before returning, since the result should be an integer
        return (int) r;
    }
}
