# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        This function takes two linked lists, l1 and l2, which represent two non-negative integers.
        The digits are stored in reverse order, and each of their nodes contains a single digit.
        The function returns the sum as a linked list.
        
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

        # Create a dummy node that will serve as the starting point for the result linked list.
        dummy = ListNode(0)

        # 'curr' will point to the last node in the result linked list.
        curr = dummy

        # Initialize carry to 0, as there's no carry initially.
        carry = 0

        # Loop until both linked lists are fully traversed.
        while(l1 or l2):
            # Get the value of the current node in l1, or 0 if l1 is null.
            x = l1.val if(l1 != None) else 0
            # Get the value of the current node in l2, or 0 if l2 is null.
            y = l2.val if(l2 != None) else 0

            # Calculate the total sum of the two digits and the carry.
            total = x + y + carry

            # Update carry for the next addition (1 if total >= 10, else 0).
            carry = total // 10

            # Create a new node with the digit value of (total % 10) and attach it to the result list.
            curr.next = ListNode(total % 10)

            # Move the current pointer to the next node in the result list.
            curr = curr.next

            # Move to the next nodes in l1 and l2, if available.
            if(l1): 
                l1 = l1.next
            if(l2): 
                l2 = l2.next

        # If there's a carry left after the last addition, add a new node with the carry value.
        if(carry > 0):
            curr.next = ListNode(carry)

        # Return the next node of dummy, which is the head of the resulting linked list.
        return dummy.next
