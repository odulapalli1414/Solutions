class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        # Initialize r to x. This is our initial guess for the square root of x.
        r = x
        
        # Iterate until r*r is no longer greater than x.
        while (r * r > x):
            # Update r using the average of r and x/r.
            # This is the Newton's method formula for finding the square root.
            r = (r + x / r) / 2
        
        # Convert r to an integer (truncate the decimal part) and return it.
        return int(r)
