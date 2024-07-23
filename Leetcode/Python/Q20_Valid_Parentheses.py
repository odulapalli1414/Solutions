class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # Initialize an empty stack to keep track of opening brackets
        stack = []
        
        # Iterate through each character in the input string
        for i in s:
            # If the character is an opening bracket, push it onto the stack
            if i == '(' or i == '{' or i == '[':
                stack.append(i)
            else:
                # If the stack is empty and the current character is a closing bracket, return False
                if len(stack) == 0:
                    return False
                # If the top of the stack matches the current closing bracket, pop the stack
                elif (stack[-1] == '(' and i == ')') or (stack[-1] == '{' and i == '}') or (stack[-1] == '[' and i == ']'):
                    stack.pop()
                else:
                    # If the top of the stack does not match the current closing bracket, return False
                    return False
        
        # After processing all characters, check if the stack is empty
        # If it is, all opening brackets had matching closing brackets, so return True
        # If it is not, there are unmatched opening brackets, so return False
        return len(stack) == 0
