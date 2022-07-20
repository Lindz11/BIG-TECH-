class Solution {
    public int findKthLargest(int[] nums, int k) {
      // This uses a max heap instead of a min heap to make sure all large elements are at the top of our queue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i: nums) {
            queue.add(i); 
        }
        while(k!=1 && !queue.isEmpty()) {
            int i = queue.remove(); 
            k--; 
        }
        
        return queue.remove();
    }
}
