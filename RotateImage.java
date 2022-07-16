class Solution {
    public void rotate(int[][] matrix) {
        int col = matrix[0].length; 
        int row = matrix.length; 
        int temp = 0;
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) { 
                arr[j][row - i - 1] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) { 
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}
