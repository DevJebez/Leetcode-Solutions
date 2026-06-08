class Solution {
    static int helper(int current, int start, int[] nums, int[] dp){
        if(current < start) return 0;
        if(current == start) return nums[start];
        if(dp[current] != -1) return dp[current];

        int pick = helper(current - 2, start, nums, dp) + nums[current];
        int notpick = helper(current -1, start, nums, dp);
        return dp[current] = Math.max(pick, notpick);

    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int case1 = helper(n-1,1, nums, dp);
        Arrays.fill(dp, -1);
        int case2 = helper(n-2,0, nums, dp);
        return Math.max(case1, case2);
    }
}