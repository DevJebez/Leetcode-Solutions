class Solution {
    private boolean canDistribute(int[] quantities, int mid, int n){
        long storesNeeded = 0;
        for(int i = 0; i < quantities.length; i++){
            storesNeeded += Math.ceil((double)quantities[i] / (double)mid);;
        }
        return storesNeeded <=n ? true : false;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
        for(int i = 0; i<quantities.length; i++){
            max = Math.max(max, quantities[i]);
        }
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = (low+high)/2;
            if(canDistribute(quantities, mid, n)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}