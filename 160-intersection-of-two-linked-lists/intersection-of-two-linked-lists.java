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

        ListNode A = headA;
        ListNode B = headB;

        if(lenA==lenB){
            while(A!=B){
                A = A.next;
                B = B.next;
            }
            return A;
        }
        else{
            if(lenA>lenB){
                int n = lenA - lenB;
                for(int i=0; i<n; i++){
                    A = A.next;
                }
            }
            else{
                int n = lenB - lenA;
                for(int i=0; i<n; i++){
                    B = B.next;
                }
            }
            while(A!=B){
                A = A.next;
                B = B.next;
            }
            return A;
        }
        
    }
}