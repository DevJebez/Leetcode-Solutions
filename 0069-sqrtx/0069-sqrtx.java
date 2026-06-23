class Solution {
    public int mySqrt(int n) {
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = (l) +(r - l)/2;
            long val = (long)mid * (long)mid;
            if(val <= (long)n){
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }
        return r;
    }
}