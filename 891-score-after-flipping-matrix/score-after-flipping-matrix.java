class Solution {
    public int matrixScore(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        // Making first element zero
        for(int i=0; i<r; i++){
            if(grid[i][0]==0){
                for(int j=0; j<c; j++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        // Checking number of zeros and ones in each column
        for(int j=0; j<c; j++){
            int zeroCount= 0;
            int oneCount = 0;
            for(int i=0; i<r; i++){
                if(grid[i][j]==0) zeroCount++;
                else oneCount++;
            }
            if(zeroCount>oneCount){
                for(int i=0; i<r; i++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
            
        }
        int result = 0;
        int x = 1;
        for(int j=c-1; j>=0; j--){
            for(int i=0 ; i<r; i++){
                result+= grid[i][j]*x;
            }
            x*=2;
        }
        return result;
    }
}