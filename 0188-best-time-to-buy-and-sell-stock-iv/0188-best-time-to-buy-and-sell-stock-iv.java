class Solution {
    private int helper(int i, int buy, int cap, int[] arr, int n, int[][][] dp){
        if(i == n || cap == 0) return 0;
        if(dp[i][buy][cap] != -1)return dp[i][buy][cap];
        int profit = 0;
        if(buy == 0){
            profit = Math.max(helper(i+1, 0, cap,arr, n, dp), helper(i+1, 1, cap, arr, n, dp)-arr[i]);
        }
        else{
            profit = Math.max(helper(i+1, 1, cap, arr, n, dp) ,helper(i+1, 0,cap-1, arr, n, dp)+arr[i]);
        }
        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int k, int[] arr) {
        int n = arr.length;
        int[][][] dp = new int[n+1][2][k+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(0,0,k, arr, n, dp);
    }
}

