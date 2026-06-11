class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        if(n == 0) return 0;
        int[][][] dp = new int[n+1][2][3];
        for(int i = n-1; i >= 0; i--){
            for(int buy = 0; buy <= 1; buy++){
                for(int cap = 1; cap <= 2; cap++){
                    if(buy == 0){
                        dp[i][buy][cap] = Math.max(dp[i+1][0][cap], dp[i+1][1][cap] - arr[i]);
                    }
                    if(buy == 1){
                        dp[i][buy][cap] = Math.max(dp[i+1][1][cap], arr[i]+ dp[i+1][0][cap-1]);
                    }
                }
            }
        }
        return dp[0][0][2];
    }
}

