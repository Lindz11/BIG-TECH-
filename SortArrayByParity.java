class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int count = 0; 
        int [] ans = new int[nums.length];
        for(int i : nums) {
            if(i % 2 == 0) {
                ans[count] = i; 
                count++; 
            }
        }
        for(int i : nums) {
            if(i % 2 == 1) {
                ans[count] = i; 
                count++; 
            }
        }
        return ans; 
    }
}
