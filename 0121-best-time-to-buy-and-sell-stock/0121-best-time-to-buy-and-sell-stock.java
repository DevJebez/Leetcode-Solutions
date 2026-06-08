class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int mini = prices[0];
        for(int i = 1; i < prices.length;i++){
            int cost = prices[i] - mini;
            totalProfit = Math.max(totalProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return totalProfit;
    }
}