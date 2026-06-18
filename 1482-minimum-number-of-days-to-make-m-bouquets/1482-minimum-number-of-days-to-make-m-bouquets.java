class Solution {
    // Helper method: Returns true if we can make at least 'm' bouquets on 'mid' day
    private boolean canMakeBouquets(int[] nums, int mid, int m, int k){
        int adjacentFlowers = 0;
        int bouquets = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid){
                adjacentFlowers++;
                if(adjacentFlowers == k){
                    bouquets++;
                    adjacentFlowers = 0; 
                }
            } else {
                adjacentFlowers = 0; 
            }
        }
        return bouquets >= m;
    }

    public int minDays(int[] nums, int m, int k) {
        if((long)m * k > nums.length) return -1;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int low = min; 
        int high = max;
        while(low <= high){
            int mid = (low + high) / 2;
            if(canMakeBouquets(nums, mid, m, k)){
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }
}