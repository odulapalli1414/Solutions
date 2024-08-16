/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;          // Value of the node
 *     ListNode next;    // Pointer to the next node
 *     ListNode() {}     // Default constructor
 *     ListNode(int val) { this.val = val; }    // Constructor with value
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }    // Constructor with value and next node
 * }
 */

class Solution {
    /**
     * This method returns the middle node of a singly linked list.
     * If there are two middle nodes, it returns the second middle node.
     * 
     * @param head The head of the linked list.
     * @return The middle node of the linked list.
     */
    public ListNode middleNode(ListNode head) {
        // Calculate the length of the linked list
        int len = size(head);
        
        // Pointer to traverse the linked list
        ListNode p = head;

        // Index to keep track of the current node's position
        int idx = 1;

        // Traverse to the middle of the list
        while (idx <= len / 2) {
            p = p.next;
            idx++;
        }

        // Return the middle node
        head = p;
        return head;
    }

    /**
     * This method calculates the size (number of nodes) of the linked list.
     * 
     * @param head The head of the linked list.
     * @return The size of the linked list.
     */
    public static int size(ListNode head) {
        // Temporary pointer to traverse the list
        ListNode temp = head;
        
        // Counter to track the number of nodes
        int count = 0;
        
        // Traverse the entire list to count the nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Return the total count
        return count;
    }
}
