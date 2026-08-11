class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        ArrayList <Integer>  List= new ArrayList<>();
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart; i<=colEnd; i++){
                List.add(matrix[rowStart][i]);
            }
            rowStart++;

            for(int i=rowStart; i<=rowEnd; i++){
                List.add(matrix[i][colEnd]);
            }

            colEnd--;
            if(rowEnd>=rowStart){
                for(int i=colEnd; i>=colStart;  i--){
                    List.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colStart<=colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    List.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return List;
    }
}