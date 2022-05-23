class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length; 
        for(int i = 0; i < length - 1; i+=2) {
            if(nums[i] != nums[i + 1])
                return nums[i]; 
        }
        
        return nums[length - 1];
    }
}
