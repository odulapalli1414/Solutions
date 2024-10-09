class Solution(object):
    def areNumbersAscending(self, s):
        prev_num = -1  # Initialize with a very small number (less than any valid number in the string)

        # Split the string into tokens and process each one
        for token in s.split():
            # Check if the token is a digit
            if token.isdigit():
                curr_num = int(token)  # Convert the token to an integer
                
                # Compare the current number with the previous number
                if curr_num <= prev_num:
                    return False  # If the current number is not strictly greater, return False
                
                prev_num = curr_num  # Update prev_num to the current number
        
        return True  # If no issues were found, return True
