class Solution {
    public int maxSubArray(int[] nums) {
        // This problem is a classic sliding window problem this can be solved using math.max in 0(n) time
        int length = nums.length; 
        int global_max = Integer.MIN_VALUE;
        int curr_max = 0; 
        int first = 0; 
        int second = 0; 
        for(int i = 0; i < length; i++) {
            first = nums[i]; 
            second = nums[i] + curr_max;
            curr_max = Math.max(first, second); 
            global_max = Math.max(curr_max, global_max); 
        }
        
        return global_max; 
    }
}
