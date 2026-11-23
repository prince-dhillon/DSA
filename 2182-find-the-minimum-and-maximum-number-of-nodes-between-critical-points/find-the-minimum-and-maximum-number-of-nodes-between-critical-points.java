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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int first = -1;
        int last = -1;
        int idx = 1;
        int ans[] = {-1,-1};
        int minD = Integer.MAX_VALUE;
        while(right!=null){
            if(mid.val<left.val && mid.val<right.val || mid.val>left.val && mid.val>right.val){
                if(first==-1) first = idx;
                if(last!=-1){
                    minD = Math.min(minD,idx-last);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            right= right.next;
            mid = mid.next;
        }
        if(first==last) return ans;
        int maxD = last-first;
        ans[0] = minD;
        ans[1] = maxD;
        return ans;
    }
}