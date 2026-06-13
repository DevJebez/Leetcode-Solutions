class Solution {
    private static int maxProfit(int i, int buy, int[] arr, int n, int fee, int[][] dp){
        if(i == n) return 0;
        if(dp[i][buy] != -1) return dp[i][buy];
        int profit = 0;
        if(buy == 0){
            profit =  Math.max(maxProfit(i+1, 0, arr, n,fee, dp), maxProfit(i+1, 1, arr, n,fee, dp) - arr[i]);
        }else{
            profit = Math.max(maxProfit(i+1, 1, arr, n,fee, dp), maxProfit(i+1, 0, arr,n, fee, dp) + arr[i] - fee);
        }
        return dp[i][buy] = profit;
    }
    public int maxProfit(int[] arr,int fee) {
        int n= arr.length;
        int[][] dp = new int[n][2];
        for(int i = 0; i < n;i++){
            Arrays.fill(dp[i], -1);
        }
        return maxProfit(0, 0, arr, n, fee, dp);
    }
}
