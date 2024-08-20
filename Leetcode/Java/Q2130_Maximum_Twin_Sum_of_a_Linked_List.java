class Solution {
    public int pairSum(ListNode head) {
        // Initialize two pointers, p and q
        ListNode p = head;
        ListNode q = head.next;

        // Move p to the middle of the list and q to the end of the list
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }

        // Reverse the second half of the list starting from the node after p
        ListNode curr = p.next;
        ListNode prev = null;
        ListNode forward;

        while (curr != null) {
            forward = curr.next;   // Store the next node
            curr.next = prev;      // Reverse the current node's pointer
            prev = curr;           // Move prev to the current node
            curr = forward;        // Move to the next node in the original list
        }

        // Connect the end of the first half to the reversed second half
        p.next = q;

        // Initialize pointer r to the head and set maxSum to 0
        ListNode r = head;
        int maxSum = 0;

        // Traverse the first half (using r) and the reversed second half (using q) simultaneously
        while (q != null) {
            // Calculate the sum of corresponding nodes from both halves and update maxSum
            maxSum = Math.max(maxSum, (r.val + q.val));
            q = q.next;
            r = r.next;
        }

        // Return the maximum twin sum found
        return maxSum;
    }
}
