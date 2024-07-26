class Solution {
    public int[] plusOne(int[] digits) {
        // Iterate from the end of the array to the beginning
        for(int i = digits.length - 1; i >= 0; i--){
            // If the current digit is not 9, simply increment it and return the array
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits were 9, we need a new array with an extra length
        int[] ans = new int[digits.length + 1];
        // Set the first digit to 1
        ans[0] = 1;
        // The rest of the digits are already 0 by default
        return ans;
    }
}
