class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;
        // Zero Col
        for(int i=0; i<r; i++){
            if(arr[i][0]==0){
                zeroCol = true;
                break;
            }
        }
        // Zero Row
        for(int j=0; j<c; j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        // Setting Zeros
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(arr[i][j]==0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        // Setting Zero Columns
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(arr[i][0]==0){
                    arr[i][j] = 0;
                }
            }
        }
        // Setting Zero Rows
        for(int j=1; j<c; j++){
            for(int i=1; i<r; i++){
                if(arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
        }
        // Setting Final Zeros
        if(zeroRow){
            for(int j=0; j<c; j++){
                arr[0][j] = 0;
            }
        }
        if(zeroCol){
            for(int i=0; i<r; i++){
                arr[i][0] = 0;
            }
        }
        
    }
}