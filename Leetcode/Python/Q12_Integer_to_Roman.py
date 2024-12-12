class Solution:
    def intToRoman(self, num: int) -> str:
        # Define a list of Roman numerals in descending order of their values
        romans = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        
        # Define the corresponding values for the Roman numerals
        rv = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]

        # Initialize an empty string to store the final Roman numeral result
        result = ""           

        # Start from the first Roman numeral and corresponding value
        i = 0
        
        # Continue until the entire number has been converted
        while num > 0:
            # If the current value can be subtracted from 'num', add the corresponding Roman numeral
            if num >= rv[i]:
                result += romans[i]  # Append the Roman numeral to the result
                num -= rv[i]         # Subtract the value from 'num'
            else:
                # Move to the next smaller Roman numeral and its value
                i += 1
        
        # Return the constructed Roman numeral string
        return result
