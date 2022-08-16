class Solution {
    public int[] sumZero(int n) {
        // Use a for loop and input the negative and positive of each number into an array 
        int [] ans = new int[n]; 
        int count = 0; 
        // If a number is odd then we want to add a zero 
        if(n % 2 == 1) {
            ans[count++] = 0; 
        }
        // Since we have added the zero then we are only dealing with even cases 
        for(int i = 1; count < n; i++) {
            ans[count++] = i; 
            ans[count++] = i * - 1;    
        }
        return ans; 
    }
}
