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
     * Partitions a linked list such that all nodes less than x come before nodes greater than or equal to x.
     * The original relative order of the nodes in each of the two partitions is preserved.
     *
     * @param head The head of the singly-linked list.
     * @param x The partition value.
     * @return The head of the newly partitioned linked list.
     */
    public ListNode partition(ListNode head, int x) {
        // Create two dummy nodes to start the less and high partitions.
        ListNode less_elements = new ListNode(0);
        ListNode high_elements = new ListNode(0);

        // Initialize two pointers to build the less and high lists.
        ListNode less = less_elements;
        ListNode high = high_elements;

        // Traverse the original list and partition it.
        while (head != null) {
            if (head.val < x) {
                // Add current node to the less list.
                less.next = head;
                less = less.next;
            } else {
                // Add current node to the high list.
                high.next = head;
                high = high.next;
            }
            // Move to the next node in the original list.
            head = head.next;
        }

        // Important: Set the next pointer of the last node in the high list to null.
        high.next = null;

        // Connect the less list to the high list.
        less.next = high_elements.next;

        // Return the merged list, starting from less_elements.next.
        return less_elements.next;
    }
}
