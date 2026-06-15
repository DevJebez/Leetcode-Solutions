class Solution {
    private static long computeTotalHours(int[] piles, int rate){
        long total = 0;
        for(int i = 0; i < piles.length; i++){
            total += Math.ceil((double)piles[i] / rate);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maximum = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++){
            maximum = Math.max(maximum, piles[i]);
        }
        int low = 0;
        int high = maximum;
        while(low <= high){
            int mid = (low+ high)/2;
            long totalHours = computeTotalHours(piles, mid);
            //eating faster, so hours is low, increase speed
            if(totalHours <= h) high = mid - 1;
            //eating slower, so hours is high, decrease speed
            else low = mid+1;
        }
        return low;

    }
}