class Solution {
    public void sortColors(int[] nums) {
        int [] count = new int [3]; 
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
        int space = 0; 
        for(int j = 0; j < count.length; j++) {
            while(count[j] != 0) {
                nums[space] = j; 
                space++; 
                count[j]--; 
            }
        }
    }
}
