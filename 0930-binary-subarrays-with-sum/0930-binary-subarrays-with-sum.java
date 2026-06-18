class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            if(currentSum == goal){
                totalCount++;
            }
            if(map.containsKey(currentSum - goal)){
                totalCount += map.get(currentSum - goal);
            }
            map.put(currentSum , map.getOrDefault(currentSum, 0)+1);
        }
        return totalCount;
    }
}