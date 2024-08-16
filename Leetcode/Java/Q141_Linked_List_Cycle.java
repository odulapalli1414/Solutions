/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {

    /**
     * Detects if a cycle exists in a singly-linked list using Floyd's Cycle Detection Algorithm.
     * 
     * @param head The head of the singly-linked list.
     * @return true if a cycle exists, false otherwise.
     */
    public boolean hasCycle(ListNode head) {
        // Initialize two pointers, p (slow) and q (fast), both starting at the head.
        ListNode p = head;
        ListNode q = head;

        // Traverse the list until the fast pointer or its next node is null.
        while(q != null && q.next != null){
            // Move the slow pointer one step forward.
            p = p.next;
            // Move the fast pointer two steps forward.
            q = q.next.next;

            // If the slow pointer and fast pointer meet, a cycle is detected.
            if(p == q){
                return true;
            }
        }

        // If no cycle is found, return false.
        return false;
    }
}
