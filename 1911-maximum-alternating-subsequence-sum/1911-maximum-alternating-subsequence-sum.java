class Solution {
    public long helper(int i, int isEven, int[] nums, int n, long[][] dp){
        if(i == n) return 0;
        if(dp[i][isEven] != -1) return dp[i][isEven];
        long total = 0;
        if(isEven == 0){
            total = Math.max(helper(i+1, 0, nums, n, dp) , helper(i+1, 1, nums, n, dp) - nums[i]); 
        }else{
            total = Math.max(helper(i+1,1 , nums, n, dp), helper(i+1, 0, nums, n, dp)+nums[i]);
        }
        return dp[i][isEven]= total;
    }
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n][2];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        if(n == 1) return nums[0];
        return helper(0,1, nums, n, dp);
    }
}