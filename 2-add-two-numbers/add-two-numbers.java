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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a placeholder dummy node to easily build the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Continue looping if there are still digits left or a remaining carryover value
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate sum and update carryover
            int total = val1 + val2 + carry;
            carry = total / 10;
            int newVal = total % 10;

            // Create new node and attach it to the solution list
            current.next = new ListNode(newVal);
            current = current.next;

            // Move list pointers to the next node if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the actual head of the list, skipping the initial dummy node
        return dummyHead.next;
    }
}

