class Solution {
    /*
    static int helper(int n, int[] arr){
        if(n == 0 || n == 1) return 0;
        int cost1 = helper(n-1, arr) + arr[n-1];
        int cost2 = helper(n-2, arr) + arr[n-2];
        return Math.min(cost1, cost2);
    }
    */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<= n; i++){
            int cost1 = dp[i-1] + cost[i-1];
            int cost2 = dp[i-2] + cost[i-2];
            dp[i] = Math.min(cost1, cost2);
        }
        return dp[n];
    }
}