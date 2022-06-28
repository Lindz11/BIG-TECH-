class Solution {
    public void sortColors(int[] nums) {
        int [] count = new int [3]; 
        // Make a array keeping track of the count
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count[0]++; 
            }
            if(nums[i] == 1){
                count[1]++; 
            }
            if(nums[i] == 2){
                count[2]++; 
            }
        }
        // Use a secodn for loop to keep track from the front of the array and fill it in order 
        int space = 0; 
        for(int j = 0; j < nums.length; j++) {
            if(count[space] > 0) {
                nums[j] = space; 
                count[space]--; 
            }
            // If you count is 0 then incrememnt to the next number and go back one
            else if(count[space] == 0) {
                space++; 
                j--; 
            }
        }
    }
}
