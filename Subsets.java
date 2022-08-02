class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Use backtracking and recursion for this problem 
        // Have a helper function that adds the everytime you form you see a new integer 
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> subset = new ArrayList<>(); 
        helper(nums, 0, ans, subset); 
        return ans; 
    }
    
    public void helper(int[] nums, int index, List<List<Integer>> ans, List<Integer> subset) {
        // Add every instance that we see into our answer 
        ans.add(new ArrayList<>(subset)); 
        // If the subset is the length of the array then we have input every element possible in the subset
        if(subset.size() == nums.length) {
            return; 
        }
        // Loop through each element in the array 
        for(int i = index; i < nums.length; i++) {
            // Add it to our subset
            subset.add(nums[i]); 
            // 
            helper(nums, i + 1, ans, subset);
            // If we can add anymore go abck and remove the number from the set
            subset.remove(subset.size() - 1);
            // decrement the index 
            index--; 
        }
        return; 
    }
}
