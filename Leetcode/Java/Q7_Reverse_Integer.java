class Solution {
    public int reverse(int x) {
        // Initialize the variable to store the reversed number
        int reversed = 0;

        // Loop until all digits are processed
        while (x != 0) {
            // Extract the last digit of x
            int pop = x % 10;
            // Remove the last digit from x
            x /= 10;

            // Check for potential overflow before updating reversed
            // If reversed is greater than the maximum value an int can hold divided by 10, it will overflow when multiplied by 10
            // If reversed is equal to the max divided by 10, check if adding the next digit would cause overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Return 0 in case of overflow
            }

            // Check for potential underflow before updating reversed
            // If reversed is less than the minimum value an int can hold divided by 10, it will underflow when multiplied by 10
            // If reversed is equal to the min divided by 10, check if adding the next digit would cause underflow
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Return 0 in case of underflow
            }

            // Update reversed with the next digit
            reversed = reversed * 10 + pop;
        }

        // Return the reversed number
        return reversed;
    }
}
