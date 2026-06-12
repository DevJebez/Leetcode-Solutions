class Solution {

    public int maxProfit(int k, int[] arr) {
        int n = arr.length;
        int[][][] dp = new int[n][2][k+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                Arrays.fill(dp[i][j], -(int)1e9);
            }
        }
        dp[0][0][0]= 0;
        dp[0][1][0]=-arr[0];
        for(int i = 1; i < n; i++){
            for(int cap = 0; cap <= k; cap++){
                dp[i][1][cap] = Math.max(dp[i-1][1][cap], dp[i-1][0][cap] - arr[i]);
                dp[i][0][cap] = dp[i-1][0][cap];
                if(cap > 0){
                    dp[i][0][cap] = Math.max(dp[i][0][cap], dp[i-1][1][cap-1]+arr[i]);
                }
            }
        }
        int maxProfit = 0;
        for (int cap = 0; cap <= k; cap++) {
            maxProfit = Math.max(maxProfit, dp[n-1][0][cap]);
        }
        
        return maxProfit;
        
    }
}

