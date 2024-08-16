class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Create a dummy node that points to the head of the list.
        // This handles cases where the reversal starts at the head.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers:
        ListNode Lp = dummy;  // Pointer to the node before the left position
        ListNode curr = head; // Pointer to traverse the list
        ListNode prev = null; // Pointer to store the previous node during reversal
        ListNode forward;     // Pointer to store the next node during reversal

        // Move Lp and curr to the starting point just before the left position
        for (int i = 0; i < left - 1; i++) {
            Lp = curr;
            curr = curr.next;
        }

        // Reverse the sublist from left to right
        for (int i = 0; i <= right - left; i++) {
            forward = curr.next;  // Save the next node
            curr.next = prev;     // Reverse the current node's pointer
            prev = curr;          // Move prev to the current node
            curr = forward;       // Move curr to the next node
        }

        // Adjust the pointers to reconnect the reversed sublist with the original list
        Lp.next.next = curr;  // Connect the end of the reversed sublist to the remaining list
        Lp.next = prev;       // Connect the node before left to the new head of the reversed sublist

        // Return the new head of the list, which is dummy.next
        return dummy.next;
    }
}
