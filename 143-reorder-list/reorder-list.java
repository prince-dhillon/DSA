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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        
        ListNode newHead = rev(second);
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode t1 = head;
        ListNode t2 = newHead;
        while(t1!=null && t2!=null){

            t.next = t1;
            t = t.next;
            t1 = t1.next;

            t.next = t2;
            t = t.next;
            t2 = t2.next;
        }

        t.next = t1;
    }
}