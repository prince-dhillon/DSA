/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int lenA = 0;
        int lenB = 0;
        while(a!=null){
            lenA++;
            a = a.next;
        }
        while(b!=null){
            lenB++;
            b = b.next;
        }
        ListNode t1 = headA;
        ListNode t2 = headB;

        if(lenA==lenB){
            while(t1!=t2){
                t1 = t1.next;
                t2 = t2.next;
            }
            return t2;
        }
        else{
            if(lenB>lenA){
                int len = lenB-lenA;
                for(int i=0; i<len; i++){
                    t2 = t2.next;
                }
                while(t1!=t2){
                t1 = t1.next;
                t2 = t2.next;
                }
                return t2;
            }
            else{
                int len = lenA-lenB;
                for(int i=0; i<len; i++){
                    t1 = t1.next;
                }
                while(t1!=t2){
                t1 = t1.next;
                t2 = t2.next;
                }
                return t2;
            }
        }
        
    }
}