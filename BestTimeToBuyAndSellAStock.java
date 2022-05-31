class Solution {
    public int maxProfit(int[] prices) {
        // I think this can be solved in 0(n) time using a single for loop and maybe max function
        int buy = Integer.MAX_VALUE; 
        int profit = 0; 
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i]; 
                continue;
            }
            profit = Math.max(profit, prices[i] - buy); 
        }
        
        return profit; 
    }
}
