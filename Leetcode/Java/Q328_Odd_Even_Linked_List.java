class Solution {
    public ListNode oddEvenList(ListNode head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // Initialize pointers for odd and even nodes
        ListNode odd = head;            // Start with the first node (odd)
        ListNode even = head.next;      // Start with the second node (even)
        ListNode evenHead = even;       // Store the head of the even nodes to append later

        // Loop until there are no more even nodes or the next even node is null
        while (even != null && even.next != null) {
            // Link the current odd node to the next odd node (skipping the even node)
            odd.next = even.next;
            odd = odd.next; // Move the odd pointer to the next odd node

            // Link the current even node to the next even node (skipping the odd node)
            even.next = odd.next;
            even = even.next; // Move the even pointer to the next even node
        }

        // Append the even nodes list after the odd nodes list
        odd.next = evenHead;

        // Return the modified list with odd nodes followed by even nodes
        return head;
    }
}
