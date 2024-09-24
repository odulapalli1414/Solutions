/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    // This method deletes duplicates from a sorted linked list.
    public ListNode deleteDuplicates(ListNode head) {

        // Check if the list is empty, return null if no elements are present.
        if (head == null) {
            return null;
        }

        // Create a dummy node to avoid edge case issues at the start of the list.
        ListNode dummy = new ListNode(0);
        dummy.next = head;  // Connect the dummy node to the head of the list.

        // Start a temp pointer from the first actual node in the list.
        ListNode temp = dummy.next;

        // Traverse the list until we reach the last node.
        while (temp.next != null) {

            // If the current node's value equals the next node's value, it's a duplicate.
            if (temp.val == temp.next.val) {
                // Skip over the next node (which is a duplicate) by pointing to the node after it.
                temp.next = temp.next.next;
            } else {
                // If the current node's value is unique, move the temp pointer to the next node.
                temp = temp.next;
            }
        }

        // Return the head of the modified list, with duplicates removed.
        return head;
    }
}
