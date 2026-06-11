class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n+1][2];
        dp[0][1] = -arr[0]; // bought the first stock
        dp[0][0] = 0; // didn't buy the first stock
        for(int i = 1; i < n; i++){
            //maximum of skipping and selling
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + arr[i]);
            //maximum of holding and buying
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - arr[i]);
        }
        return dp[n-1][0];

    }
}

