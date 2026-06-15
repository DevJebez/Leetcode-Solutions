class Solution {
    private static long satisfiedChildren(int[] candies, int k){
        long total= 0;
        for(int i = 0; i < candies.length; i++){
            total += candies[i]/k;
        }
        return total;

    }
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        int n = candies.length;
        for(int i = 0; i < n; i++){
            max = Math.max(max, candies[i]);
        }
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = (low + high)/2;
            long x = satisfiedChildren(candies, mid);
            if(x >= k) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
}