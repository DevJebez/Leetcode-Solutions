class Solution {
    /*
    static int helper(int n, int[] dp){
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = helper(n-1, dp) + helper(n-2, dp); 
    }
    */
    public int climbStairs(int n) {
        /*
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        */

        //space optimization
        int prev1 = 1;
        int prev2 = 1;
        for(int i = 2; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}