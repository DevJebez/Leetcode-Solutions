class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m = players.length;
        int n = trainers.length;
        int l = 0;
        int r = 0;
        while(l < m && r < n){
            if(players[l] <= trainers[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}