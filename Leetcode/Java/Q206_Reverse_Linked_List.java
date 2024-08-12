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
    public ListNode reverseList(ListNode head) {
        // Initialize 'prev' to null because the new tail of the reversed list will point to null
        ListNode prev = null;
        
        // 'curr' is used to traverse the list, starting at the head
        ListNode curr = head;
        
        // Temporary pointer to store the next node
        ListNode forward;

        // Iterate through the list until we reach the end
        while (curr != null) {
            // Store the next node before reversing the link
            forward = curr.next;
            
            // Reverse the link by pointing 'curr.next' to 'prev'
            curr.next = prev;
            
            // Move 'prev' and 'curr' one step forward
            prev = curr;
            curr = forward;
        }
        
        // At the end of the loop, 'prev' will be the new head of the reversed list
        head = prev;

        // Return the new head of the reversed list
        return prev;
    }
}
