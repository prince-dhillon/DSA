
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];

        for (int[] row : matrix) {
            Arrays.fill(row, -1);
        }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (head != null) {

            // Move right
            for (int j = left; j <= right && head != null; j++) {
                matrix[top][j] = head.val;
                head = head.next;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom && head != null; i++) {
                matrix[i][right] = head.val;
                head = head.next;
            }
            right--;

            // Move left
            for (int j = right; j >= left && head != null; j--) {
                matrix[bottom][j] = head.val;
                head = head.next;
            }
            bottom--;

            // Move up
            for (int i = bottom; i >= top && head != null; i--) {
                matrix[i][left] = head.val;
                head = head.next;
            }
            left++;
        }

        return matrix;
    }
}
