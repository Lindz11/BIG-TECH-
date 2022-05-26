class Solution {
    public void moveZeroes(int[] nums) {
        // This is a pointer question where you need to either move all non - zeros down or move all zeros up first 
        int length = nums.length; 
        int zeros = 0; 
        for(int i = 0; i < length ; i++) {
            if(nums[i] != 0) {
                nums[zeros] = nums[i]; 
                zeros++; 
            }   
        }
        
        for(int j = zeros ; j < length; j++) {
            nums[j] = 0; 
        }
    }
}
