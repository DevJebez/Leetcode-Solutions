class Solution {
    public static int getLast(long num){
        return (int)(num%10);
    }
    public static int getFirst(long num){
        int digit = 0;
        while(num > 0){
            digit = (int)(num%10);
            num = num/10;
        }
        return digit;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            long sum =0;
            for(int j = i; j < n; j++){
                sum += (long)nums[j];
                if(getFirst(sum) == x && getLast(sum) == x){
                    count++;
                }
            }
        }
        return count;
    }
}