class Solution {
    public int[] twoSum(int[] nums, int target) {
        // I can use a hashmap to keep track of each integer and their position in the array
        int length = nums.length; 
        int [] ans = new int [2]; 
        int one = 0; 
        HashMap<Integer, Integer> sol = new HashMap<>(); 
        for(int i = 0; i < length; i++) {
            sol.put(nums[i], i); 
        }
        
        for(int j = 0; j < length; j++) {
            one = target - nums[j];  
            if(sol.containsKey(one) && sol.get(one)!=j)
            {
                ans[0] = j; 
                ans[1] = sol.get(one); 
                return ans; 
            }
        }
        
        return null; 
    }
}
