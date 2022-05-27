class Solution {
    public int missingNumber(int[] nums) {
        // This problem can be solved using either a regular forloop or a hashset with a forloop to see which element is not contains            inside of the array 
        Arrays.sort(nums); 
        int length = nums.length; 
        if(nums[0] != 0)
            return 0; 
        if(nums[length - 1] != length)
            return length; 
        for(int i = 1; i < length; i++) {
            if(i != nums[i])
                return i; 
        }
        return 0; 
    }
}
