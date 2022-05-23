class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        int major = nums.length / 2; 
        int times = 1; 
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            if(nums[i] == nums[i + 1])
                times++; 
            else
                times = 1; 
            if(times > major)
                return nums[i];
        }
        return 0; 
    }
}
