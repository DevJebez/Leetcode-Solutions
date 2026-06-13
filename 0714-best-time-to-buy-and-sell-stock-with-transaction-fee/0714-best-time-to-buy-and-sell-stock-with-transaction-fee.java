class Solution {
  public int maxProfit(int[] arr,int fee) {
    int n = arr.length;
    int[][] dp = new int[n][2];
    dp[0][0] = 0;
    dp[0][1] = -arr[0];
    int profit = 0;
    for (int i = 1; i < n; i++) {
      dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - arr[i]);
      dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + arr[i] - fee);
    }
    //you should not return dp[n-1][1] because that is suboptimal and we can no longer buy asset on the last day.
    return dp[n-1][0];
  }
}
