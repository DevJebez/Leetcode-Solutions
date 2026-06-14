class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        if(n == 0) return 0;
        int[] left_max = new int[n];
        int[] right_max = new int[n];
        left_max[0] = heights[0];
        for(int i =1 ; i<n; i++){
            left_max[i] = Math.max(left_max[i-1], heights[i]);
        } 
        right_max[n-1] = heights[n-1];
        for(int j = n-2; j >= 0; j--){
            right_max[j] = Math.max(right_max[j+1], heights[j]);
        }
        int totalWater =0;
        for(int i = 0; i < n; i++){
            int level =  Math.min(left_max[i], right_max[i]);
            totalWater += level - heights[i];
        }
        return totalWater;
    }
}