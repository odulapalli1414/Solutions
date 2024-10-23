class Solution(object):
    def secondHighest(self, s):
        # Initialize two variables to track the largest and second largest digits.
        # Set both to -1 initially, assuming no digits found.
        largest = -1
        second_lagest = -1
        
        # Loop through each character in the string
        for i in s:
            # Check if the character is a digit using the isdigit() function
            if i.isdigit():
                # Convert the character to an integer
                num = int(i)
                
                # If the current number is greater than the current largest number,
                # update second_lagest to largest, and then update largest to num
                if largest < num:
                    second_lagest = largest
                    largest = num
                # If the current number is greater than the second largest number 
                # and it is not equal to the largest number, update second_lagest
                elif num > second_lagest and num != largest:
                    second_lagest = num
        
        # Return the second largest digit found; if not found, it will return -1
        return second_lagest
