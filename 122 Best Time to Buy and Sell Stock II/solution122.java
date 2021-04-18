class Solution {
    public int maxProfit(int[] prices) {
		
		// if no prices or price = 0
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int profit = 0;
		
		// look through all prices and compare adjacents
        for(int i = 0; i < prices.length - 1; i++) {
			
			// if adjacent is greater, then add difference to the profit
            if(prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}