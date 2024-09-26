import java.util.*;

class MyQueue {
    // Two stacks to implement the queue
    Stack<Integer> s1;
    Stack<Integer> s2;

    // Constructor to initialize the stacks
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    /**
     * Push element x to the back of the queue.
     * To maintain the order, we first move all elements from s1 to s2,
     * then push the new element to s1, and finally move everything back to s1.
     */
    public void push(int x){
        // Move all elements from s1 to s2
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        
        // Push the new element onto s1
        s1.push(x);
        
        // Move elements back from s2 to s1
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    /**
     * Remove the element from the front of the queue and return it.
     * Since the queue is implemented using s1, we simply pop from s1.
     */
    public int pop(){
        return s1.pop();
    }

    /**
     * Get the front element of the queue without removing it.
     * The front element is at the top of s1.
     */
    public int peek(){
        return s1.peek();
    }

    /**
     * Check whether the queue is empty.
     * The queue is empty if s1 is empty.
     */
    public boolean empty(){
        return s1.empty();
    }
}

/**
 * Example usage:
 * MyQueue obj = new MyQueue();
 * obj.push(x);          // To push element x to the queue
 * int param_2 = obj.pop();  // To pop an element from the queue
 * int param_3 = obj.peek(); // To peek at the front element
 * boolean param_4 = obj.empty();  // To check if the queue is empty
 */
