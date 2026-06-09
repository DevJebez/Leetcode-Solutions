class Solution {
    private int MOD = (int)1e9 + 7;
    private int helper(int i,int[][] dp, int amount, int[] coins){
        if(i == 0){
            return amount % coins[i] == 0 ? 1 : 0;
        }
        if(dp[i][amount] != -1) return dp[i][amount];
        int notPick = helper(i-1,dp, amount, coins);
        int pick = 0;
        if(coins[i] <= amount){
            pick = helper(i, dp, amount - coins[i], coins);
        }
        return (dp[i][amount]=pick + notPick % MOD);
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        return helper(n-1,dp, amount, coins);
    }
}