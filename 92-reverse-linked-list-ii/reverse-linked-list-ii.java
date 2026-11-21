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
        if(head==null || head.next==null) return head;
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        if(left == right) return head;
        int count = 1;
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        ListNode temp = head;

        while(temp!=null){
            if(count+1==left){
                a = temp;
            }
            else if(count==left){
                b = temp;
            }
            else if(count==right){
                c = temp;
            }
            else if(count==right+1){
                d = temp;
            }
            temp = temp.next;
            count++;
        }
        if(a != null) a.next = null;
        if(c != null) c.next = null;
        ListNode newHead = rev(b);
        if(a != null) a.next = newHead;
        b.next = d;
        if(a == null) return newHead;
        return head;
    }
}