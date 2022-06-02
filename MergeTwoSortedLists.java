class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // I need to make sure that the next
        ListNode merged = new ListNode(0); 
        ListNode temp = merged; 
        while(list1 != null && list2!= null) {
            if(list1.val < list2.val){
                temp.next = list1; 
                list1 = list1.next;
            }
            else
            {
                temp.next = list2; 
                list2 = list2.next;
            }  
            temp = temp.next;
        }
        
        if(list1 == null)
            temp.next = list2; 
        if(list2 == null)
            temp.next = list1; 
        
        return merged.next; 
    }
}
