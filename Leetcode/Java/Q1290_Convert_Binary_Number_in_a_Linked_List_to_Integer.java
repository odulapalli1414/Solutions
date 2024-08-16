class Solution {

    // Method to reverse the linked list
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;  // Previous node, initially null
        ListNode curr = head;  // Current node, starting at the head of the list
        ListNode forward;      // Node to hold the next node in the list

        // Traverse through the linked list and reverse the pointers
        while (curr != null) {
            forward = curr.next;  // Save the next node
            curr.next = prev;     // Reverse the current node's pointer
            prev = curr;          // Move prev to the current node
            curr = forward;       // Move curr to the next node (saved in forward)
        }
        head = prev;  // Update head to point to the new front of the reversed list

        return head;  // Return the new head of the reversed list
    }

    // Method to convert a binary number represented by a linked list to a decimal integer
    public int getDecimalValue(ListNode head) {
        ListNode res = reverse(head);  // Reverse the linked list to read binary digits from least to most significant

        double ans = 0.0;  // To store the final decimal value, initialized to 0.0
        ListNode temp = res;  // Temporary pointer to traverse the reversed list
        int count = 0;  // Counter to keep track of the position of the binary digit

        // Traverse through the reversed linked list
        while (temp != null) {
            // Calculate the decimal value by summing up the binary digit value multiplied by 2 raised to the power of its position
            ans = ans + (temp.val * Math.pow(2.0, (double) count));
            temp = temp.next;  // Move to the next node
            count++;  // Increment the position counter
        }
        return (int) ans;  // Return the final decimal value as an integer
    }
}
