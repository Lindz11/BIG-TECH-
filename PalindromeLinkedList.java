class Solution {
    // I think that this problem can be solved using strings to capture all of the ints and 
    // String builder and reverse when over time limitation
    // Using an arraylist made it so it turns into a binary search problem
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> vals = new ArrayList<>(); 
        while(head != null) {
            vals.add(head.val);
            head = head.next; 
            
        }
        int i = 0; 
        int end = vals.size() - 1; 
        while(i <= end) {
            if(vals.get(i) != vals.get(end))
                return false;
            i++; 
            end--; 
        }
        
        return true; 
        
    }
}
