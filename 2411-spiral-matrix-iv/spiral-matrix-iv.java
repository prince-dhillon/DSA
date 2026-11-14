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
import java.util.*;
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int rowS = 0;
        int rowE = m-1;
        int colS = 0;
        int colE = n-1;
        int ans[][] = new int[m][n];
        for (int[] row : ans) {
            Arrays.fill(row, -1);
        }
        while(colS<=colE || rowS<=rowE && head != null){
            // Right
            for(int i=colS; i<=colE && head != null; i++){
                ans[rowS][i] = head.val;
                head = head.next;
            }
            rowS++;
            // Down
            for(int i=rowS; i<=rowE && head != null; i++){
                ans[i][colE] = head.val;
                head = head.next;
            }
            colE--;
            // Left
            if(rowS<=rowE){
                for(int i=colE; i>=colS && head != null; i--){
                    ans[rowE][i] = head.val;
                    head = head.next;
                }
                rowE--;
            }

            //Down
            if(colS<=colE){
                for(int i=rowE; i>=rowS && head != null; i--){
                    ans[i][colS] = head.val;
                    head = head.next;
                }
                colS++;
            }

        }
        return ans;

    }
}