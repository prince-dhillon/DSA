class Solution {
    public int matrixScore(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0; i<r; i++){
            if(arr[i][0]==0){
                for(int j=0; j<c; j++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }

        }
        for(int j=0; j<c; j++){
            int zero = 0;
            int one = 0;
            for(int i=0; i<r; i++){
                if(arr[i][j]==0) zero++;
                else one++; 
            }
            if(zero>one){
                for(int i=0; i<r; i++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        int result = 0;
        for(int i=0; i<r; i++){
            int x = 1;
            for(int j=c-1; j>=0; j--){
                result+=arr[i][j]*x;
                x*=2;
            }     
        }
        return result;
    }
}