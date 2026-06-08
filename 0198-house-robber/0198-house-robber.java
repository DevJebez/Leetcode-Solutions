class Solution {
    static int helper(int n, int[] dp,int[] nums){
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        if(dp[n] != -1) return dp[n];
        int pick = helper(n-2, dp, nums) + nums[n];
        int notpick = helper(n-1, dp, nums);
        return dp[n] = Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n-1, dp, nums);
    }
}