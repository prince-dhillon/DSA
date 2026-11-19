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
    public boolean isPalindrome(ListNode head) {
        ListNode t1 = head;
        ListNode dummy = new ListNode(-1);
        ListNode t2 = dummy;
        while(t1!=null){
            ListNode x = new ListNode(-1);
            x.val = t1.val;
            t2.next = x;
            t1 = t1.next;
            t2 = t2.next;
        }

        ListNode c = dummy;
        ListNode p = null;
        ListNode n = null;
        while(c!=null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }

        ListNode x1 = head;
        ListNode x2 = p;

        while(x1!=null && x2!=null){
            if(x1.val!=x2.val) return false;
            x1 = x1.next;
            x2 = x2.next;
        }

        return true;
        
    }
}