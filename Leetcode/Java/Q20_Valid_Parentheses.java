class Solution {
    public boolean isValid(String s) {
        // Initialize an index to traverse the string
        int idx = 0;
        
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        while(idx < s.length()) {
            // If the current character is an opening bracket, push it onto the stack
            if(s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
                stack.push(s.charAt(idx));
            } else {
                // If the stack is empty and the current character is a closing bracket, return false
                if(stack.isEmpty() && s.length() != 0) {
                    return false;
                }
                // Check if the current character is a closing bracket and matches the top of the stack
                else if((s.charAt(idx) == ')' && stack.peek() == '(') || 
                        (s.charAt(idx) == ']' && stack.peek() == '[') || 
                        (s.charAt(idx) == '}' && stack.peek() == '{')) {
                    // If it matches, pop the top of the stack
                    stack.pop();
                } else {
                    // If it doesn't match, return false
                    return false;
                }
            }
            // Move to the next character
            idx++;
        }
        
        // If the stack is empty after processing the entire string, return true
        if(stack.isEmpty()) {
            return true;
        }
        
        // If the stack is not empty, return false
        return false;
    }
}
