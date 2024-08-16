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

    /**
     * Removes the nth node from the end of the list.
     * 
     * @param head The head of the singly-linked list.
     * @param n The position from the end of the list of the node to remove.
     * @return The head of the modified list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node that points to the head of the list.
        // This helps handle edge cases such as removing the head node.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers, p and q, both starting at the dummy node.
        ListNode p = dummy;
        ListNode q = dummy;
        
        // Move pointer p n+1 steps forward so that the gap between p and q is n nodes.
        for(int i = 0; i <= n; i++){
            p = p.next;
        }

        // Move both pointers one step at a time until p reaches the end of the list.
        // At this point, q will be at the node just before the one that needs to be removed.
        while(p != null){
            q = q.next;
            p = p.next;
        }

        // Skip the nth node from the end by changing the next pointer of q.
        q.next = q.next.next;

        // Return the head of the modified list, which may be different if the head was removed.
        return dummy.next;
    }
}
