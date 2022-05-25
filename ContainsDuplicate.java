class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<>(); 
        
        for(int n: nums){
            if(!dup.add(n))
                return true; 
        }
        
        return false; 
    }
}
