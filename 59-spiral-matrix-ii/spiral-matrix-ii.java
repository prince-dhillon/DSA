class Solution {
    public int[][] generateMatrix(int n) {
        int result[][] = new int[n][n];
        int count = 1;
        int rowStart = 0;
        int rowEnd = result.length-1;
        int colStart = 0;
        int colEnd = result.length-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart; i<=colEnd; i++){
                result[rowStart][i] = count++;
            }
            rowStart++;
            
            for(int i=rowStart; i<=rowEnd; i++){
                result[i][colEnd] = count++;
            }
            colEnd--;
            if(rowEnd>=rowStart){
                for(int i=colEnd; i>=colStart;  i--){
                    result[rowEnd][i] = count++;
                }
            }
            rowEnd--;

            if(colStart<=colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    result[i][colStart] = count++;
                }
            }
            colStart++;
        }
        return result;
    }
}