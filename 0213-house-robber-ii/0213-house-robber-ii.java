class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int case1 = cases(nums, 0, n - 2);
        int case2 = cases(nums, 1, n - 1);
        return Math.max(case1, case2);
    }

    private int cases(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        //start from the 3rd house
        for (int i = start + 2; i <= end; i++) {
            int pick = nums[i] + dp[i - 2];
            int notpick = dp[i - 1];
            
            dp[i] = Math.max(pick, notpick);
        }
        return dp[end];
    }
}