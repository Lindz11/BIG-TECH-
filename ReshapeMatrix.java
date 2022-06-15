class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Look at the easier problem that you solved and try to use a nested for loop 
        int rows = mat.length; 
        int cols = mat[0].length; 
        // If they don't have the same amount of inputs then return the original matrix
        if(r * c != rows * cols)
            return mat; 
        int [][] ans = new int [r][c];
        int row = 0, col = 0; 
        // Loop through each index in the new matrix and fill it in
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                // If we reach the end of the columns in our original matrix we need to now reset and go to the next row. 
                if(col == cols) {
                    col = 0; 
                    row++; 
                }
                ans[i][j] = mat[row][col]; 
                col++; 
            }
        }
        
        return ans; 
        
    }
}
