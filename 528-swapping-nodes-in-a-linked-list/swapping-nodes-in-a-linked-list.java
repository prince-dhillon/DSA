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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        for(int i=1; i<=k-1; i++){
            slow = slow.next;
        }

        for(int i=1; i<=len-k; i++){
            fast = fast.next;
        }

        int x = slow.val;
        slow.val = fast.val;
        fast.val = x;

        return head;

    }
}