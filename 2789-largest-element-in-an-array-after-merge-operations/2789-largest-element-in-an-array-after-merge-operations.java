class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long maxSum = nums[n-1];
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] <= maxSum){
                maxSum += nums[i];
            }
            else {
                maxSum = nums[i];
            }
        }
        return maxSum;
    }
}