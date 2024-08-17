import java.util.*;  

class Solution {
    /**
     * Reverses the input character array in place.
     *
     * @param s The character array to be reversed.
     */
    public void reverseString(char[] s) {
        // Stack to hold characters temporarily
        Stack<Character> stack = new Stack<>();
        
        // Push each character of the array onto the stack
        for(int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        
        // Pop each character from the stack and overwrite the original array
        for(int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
        }
    }
}
