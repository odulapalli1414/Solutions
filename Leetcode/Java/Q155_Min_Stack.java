import java.util.*;

class MinStack {

    // Stack to store the elements of the stack
    Stack<Integer> s1;

    // ArrayList to keep track of all elements and sort them to get the minimum
    ArrayList<Integer> min = new ArrayList<>();

    // Constructor to initialize the stack
    public MinStack() {
        s1 = new Stack<>();
    }

    /**
     * Push an element x onto the stack.
     * Also add the element to the ArrayList 'min' to track all elements.
     *
     * @param x: the value to be pushed onto the stack.
     */
    public void push(int x) {
        // Add the element to both the stack and min list
        min.add(x);
        s1.push(x);
    }

    /**
     * Removes the top element from the stack.
     * Also removes the element from the 'min' list.
     */
    public void pop() {
        // Remove the top element from the min list and stack
        min.remove(s1.peek());
        s1.pop();
    }

    /**
     * Get the top element of the stack.
     *
     * @return the top element of the stack.
     */
    public int top() {
        return s1.peek();
    }

    /**
     * Retrieve the minimum element in the stack.
     * To get the minimum, the 'min' list is sorted, and the first element (smallest) is returned.
     *
     * @return the minimum element in the stack.
     */
    public int getMin() {
        // Sort the min list to find the minimum value
        Collections.sort(min);
        return min.get(0);  // The smallest element is the first element in the sorted list
    }
}
