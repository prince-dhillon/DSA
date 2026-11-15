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
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode ta = a;
        ListNode tb = b;
        ListNode t = head;
        while(t!=null){
            if(t.val<x){
                ta.next = t;
                ta = ta.next;
                t = t.next;
            }
            else{
                tb.next = t;
                tb = tb.next;
                t = t.next;
            }
        }
        tb.next = null;
        a = a.next;
        b = b.next;
        if(a==null) return b;
        ta.next = b;
        return a;
    }
}