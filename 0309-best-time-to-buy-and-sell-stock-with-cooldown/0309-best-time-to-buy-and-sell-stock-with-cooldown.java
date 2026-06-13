class Solution {
    private int findProfit(int i, int buy, int[] arr, int n, int[][] dp){
        if(i >= n) return 0;
        int profit = 0;
        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy == 0){

            profit = Math.max(findProfit(i+1, 0, arr,n, dp), findProfit(i+1, 1, arr, n, dp) - arr[i]);
        }
        else{
            profit = Math.max(findProfit(i+1, 1, arr, n, dp), findProfit(i+2, 0, arr, n, dp) + arr[i]);
        }
        return dp[i][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        if(n == 1) return 0;
        int[][] dp = new int[n][2];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return findProfit(0, 0, prices, n, dp);
    }
}