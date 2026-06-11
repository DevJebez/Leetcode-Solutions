class Solution {
    private static int recurser(int i, int buy, int cap, int[] arr, int n, int[][][] dp){
        if(i == n || cap == 0) return 0;
        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];
        int profit = 0;
        if(buy == 0){
            profit = Math.max(recurser(i+1, 0, cap, arr, n,dp), recurser(i+1, 1, cap, arr, n, dp)-arr[i]);
        }
        if(buy == 1){
            profit = Math.max(recurser(i+1, 1, cap, arr, n, dp), recurser(i+1, 0, cap-1, arr, n, dp)+arr[i]);
        }
        return dp[i][buy][cap] = profit;
    }
    public int maxProfit(int[] arr) {
        int n = arr.length;
        if(n == 0)  return 0;
        int[][][] dp = new int[n][2][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        int ans = recurser(0, 0,2, arr, n, dp);
        return ans;
    }
}

