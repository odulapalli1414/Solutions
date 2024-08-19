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
    public ListNode deleteMiddle(ListNode head) {
        // Create a dummy node that points to the head of the list
        // This helps simplify edge cases where the head itself might be deleted
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers: 
        // 'slow' will eventually point to the node before the middle node
        // 'fast' will be used to find the middle by moving twice as fast as 'slow'
        ListNode slow = dummy;
        ListNode fast = head;

        // Traverse the list with the fast pointer moving twice as fast as the slow pointer
        // When 'fast' reaches the end, 'slow' will be at the node before the middle node
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it in the linked list
        slow.next = slow.next.next;

        // Return the head of the modified list, which is now 'dummy.next'
        return dummy.next;
    }
}
