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
     * This method adds two numbers represented by two linked lists.
     * The digits are stored in reverse order in the linked lists, 
     * so the least significant digit comes first.
     * The method returns the sum as a new linked list.
     *
     * @param head1 - The head of the first linked list.
     * @param head2 - The head of the second linked list.
     * @return The head of the resulting linked list representing the sum.
     */
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        // Create a dummy node to serve as the starting point for the result list.
        ListNode dummy = new ListNode(0);

        // Pointers to traverse the input linked lists and build the result list.
        ListNode p = head1, q = head2, curr = dummy;

        // Initialize carry to handle sums greater than 9.
        int carry = 0;

        // Traverse both linked lists until all nodes are processed.
        while (p != null || q != null) {
            // Get the values from the current nodes of both lists (0 if the node is null).
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            // Calculate the sum of the current digits and the carry.
            int sum = x + y + carry;

            // Update carry for the next iteration (carry can only be 0 or 1).
            carry = sum / 10;

            // Create a new node for the current digit of the sum and add it to the result list.
            curr.next = new ListNode(sum % 10);

            // Move the current pointer forward.
            curr = curr.next;

            // Move to the next node in each list if available.
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }

        // If there's still a carry after the final iteration, add a new node for it.
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        // Return the head of the resulting linked list, which is next to the dummy node.
        return dummy.next;
    }
}
