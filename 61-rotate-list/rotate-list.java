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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode t = head;
        if(head==null || head.next==null) return head;
        int len = 0;
        while(t!=null){
            len++;
            t = t.next;
        }
        k = k%len;
        if(k==0) return head;
        for(int i=0; i<k; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode x = slow.next;
        slow.next = null;
        fast.next = head;

        return x;

    }
}