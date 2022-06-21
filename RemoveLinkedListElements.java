class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0); 
        ListNode temp = ans; 
        // Use a while loop to check and since we only need to go through the list once we can use the actual list
        while(head!=null) {
            // If we encounter a value then skip over it 
            if(head.val == val) {
                head = head.next;  
                    continue; 
            }
            // If not then aff it to the current link list we are building
            ListNode add = new ListNode(head.val);  
            temp.next = add; 
            temp = temp.next; 
            head = head.next; 
        }
        // Since we started the link list at 0 we need the next node after this 
        return ans.next; 
    }
}
