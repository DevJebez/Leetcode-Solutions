class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int count = 1;
        int i = 1;
        int pos = points[0][1];
        while(i < points.length){
            if(points[i][0] > pos){
                count++;
                pos = points[i][1];
            }
            i++;
        }
        return count;
    }
}