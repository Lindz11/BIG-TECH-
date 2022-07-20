class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // Loop through the matrix
        // Have a inner loop retrieving everything on the diagnol we are currently on 
        // Put it into an arraylist, sort the arraylist
        // Go back from the start of the diagnol and insert it into the matrix 
        // Need hashset to keep track of if we have already seen a diagnol 
        // Q1: How to keep track of how each diagnol when putting back sorted numbers 
        HashSet<int[]> coordinates = new HashSet<>();
        int row = mat.length; 
        int col = mat[0].length; 
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(coordinates.contains(new int [] {i,j})) {
                    continue; 
                }
                else
                {
                    helper(row,col,i,j,mat, coordinates); 
                }
            }
        }
        
        return mat; 
    }
    public void helper(int row, int col, int i, int j, int[][] mat, HashSet<int[]> coordinates) {
        int a = i; 
        int b = j; 
        ArrayList<Integer> diagnol = new ArrayList<>(); 
        while(i < row && j < col) {
            coordinates.add(new int[] {i,j}); 
            diagnol.add(mat[i][j]); 
            i++; 
            j++; 
        }
        
        Collections.sort(diagnol); 
        for(int z = 0; z < diagnol.size(); z++) {
            mat[a][b] = diagnol.get(z); 
            a++; 
            b++;
        }
        return; 
    }
}
