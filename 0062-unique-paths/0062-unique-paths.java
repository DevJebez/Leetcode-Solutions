class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0]= 1;
        for(int row = 0; row < m; row++){
            dp[row][0] = 1;
        }
        for(int col = 0; col < n; col++){
            dp[0][col] = 1;
        }
        for(int i= 1; i < m; i++){
            for(int j = 1; j < n; j++){
                int up = dp[i-1][j];
                int left = dp[i][j-1];
                dp[i][j] = up + left;
            }
            
        }
        return dp[m-1][n-1];
    }
}