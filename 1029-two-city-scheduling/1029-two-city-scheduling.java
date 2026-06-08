class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        Arrays.sort(costs, (a,b)-> ((a[0] - a[1]) - (b[0] - b[1])));
        int totalcost = 0;
        for(int i = 0; i < n/2 ; i++){
            totalcost += costs[i][0] + costs[n/2+i][1];
        }
        return totalcost;
    }
}