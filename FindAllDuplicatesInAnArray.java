class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       // Sort at the beginning 
       // Loop through the array and if i and i + 1 are the same add it to the hashset
       // Create an array of the hashset size 
       // Add everything in the hashset to the array
        Arrays.sort(nums); 
        HashSet<Integer> dups = new HashSet<>(); 
        int length = nums.length; 
        for(int i = 0; i < length - 1; i ++) {
            if(nums[i] == nums[i + 1]) {
                dups.add(nums[i]); 
            }
       }
        ArrayList<Integer> ans= new ArrayList<>(); 
        int count = 0; 
        for(int i: dups) {
            ans.add(i);
        }
        return ans; 
    }
}
