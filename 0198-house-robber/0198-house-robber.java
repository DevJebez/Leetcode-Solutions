class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev2 = 0;
        int prev = nums[0];
        for(int i = 1; i < n; i++){
            int p = nums[i];
            if(i > 1){
                p += prev2;
            }
            int np = prev;
            int curr = Math.max(p, np);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}