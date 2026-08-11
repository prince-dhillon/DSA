class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0 ; i<n ; i++){
            int p=0;
            int r=n-1;
            while(p<=r){
                int temp = matrix[i][p];
                matrix[i][p] = matrix[i][r];
                matrix[i][r] = temp;
                p++;
                r--;
            }
        }
    }
}