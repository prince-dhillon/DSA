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
    public ListNode rev(ListNode head){
        ListNode c = head;
        ListNode p = null;
        ListNode n = null;
        while(c!=null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = rev(l1);
        l2 = rev(l2);
        ListNode t1 = l1;
        ListNode t2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        int len1 = 0;
        int len2 = 0;

        int carry = 0;

        while (t1 != null || t2 != null) {

            int val = 0;

            if (t1 != null && t2 != null) {
                val = t1.val + t2.val + carry;
            }
            else if (t1 != null) {
                val = t1.val + carry;
            }
            else {
                val = t2.val + carry;
            }

            int digit = val % 10;
            carry = val / 10;

            ListNode x = new ListNode(digit);
            t.next = x;
            t = t.next;

            if (t1 != null) t1 = t1.next;
            if (t2 != null) t2 = t2.next;
        }

        if (carry > 0) {
            t.next = new ListNode(carry);
        }

        return rev(dummy.next);
    }
}