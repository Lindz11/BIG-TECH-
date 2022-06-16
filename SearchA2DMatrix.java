class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Took brute force 0(n^2) approach and need to think of binary search optimization 
        // Optimized solution involves decrmenting the end value everytime we need see a value greater than the target
        int begin = 0; 
        int end = matrix[0].length - 1; 
       while(begin < rows && end >=0) { 
            if(matrix[begin][end] == target)
                return true; 
            if(matrix[begin][end] > target)
                end--; 
            else 
               begin++; 
 
        }
        
        return false; 
    }
}
