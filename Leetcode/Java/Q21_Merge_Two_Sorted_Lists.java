/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create pointers to traverse through list1 and list2
        ListNode head1 = list1;
        ListNode head2 = list2;

        // Initialize a dummy node to serve as the starting point for the merged list
        ListNode newList = new ListNode(0);

        // A pointer to keep track of the current end of the new merged list
        ListNode curr = newList;

        // Traverse both lists as long as neither has reached the end
        while(head1 != null && head2 != null){
            // Compare the current nodes of both lists
            if(head1.val < head2.val){
                // If the current node of list1 is smaller, add it to the merged list
                curr.next = head1;
                // Move the pointer of list1 to the next node
                head1 = head1.next;
            } else {
                // If the current node of list2 is smaller or equal, add it to the merged list
                curr.next = head2;
                // Move the pointer of list2 to the next node
                head2 = head2.next;
            }
            
            // Move the pointer of the merged list to the next position
            curr = curr.next;
        }

        // If there are any remaining nodes in list1, attach them to the merged list
        if(head1 != null){
            curr.next = head1;
        }

        // If there are any remaining nodes in list2, attach them to the merged list
        if(head2 != null){
            curr.next = head2;
        }

        // The merged list is next to the dummy node, so return newList.next
        return newList.next;
    }
}
