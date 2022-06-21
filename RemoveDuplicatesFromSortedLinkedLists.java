class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Use a while loop, Use a hashset, check to see if val already exist, create new linked list 
        ListNode ans = new ListNode(0); 
        ListNode temp = ans; 
        HashSet<Integer> nums = new HashSet<>(); 
        while(head!=null) {
            if(nums.contains(head.val)) {
                head = head.next; 
                continue; 
            }
            nums.add(head.val);  
        }
        List<Integer> sorted = new ArrayList<>(nums); 
        Collections.sort(sorted); 
        for(int i: sorted) {
            temp.next = new ListNode(i); 
            temp = temp.next; 
        }
        return ans.next; 
    }
}
