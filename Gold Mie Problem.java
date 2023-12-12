class Solution{
  static int maxGold(int n, int m, int M[][])
  {
    int dp[][] = new int[n][m];
    
    // Copy the values from the first column to the dp array
    for (int i = 0; i < n; i++) {
      dp[i][0] = M[i][0];
    }
    
    // Traverse the mine and compute the maximum gold that can be collected at each cell
    for (int j = 1; j < m; j++) {
      for (int i = 0; i < n; i++) {
        int up = (i > 0) ? dp[i - 1][j - 1] : 0;
        int right = dp[i][j - 1];
        int down = (i < n - 1) ? dp[i + 1][j - 1] : 0;
        
        // Compute the maximum gold that can be collected at this cell
        dp[i][j] = M[i][j] + Math.max(up, Math.max(right, down));
      }
    }
    
    // Find the maximum gold that can be collected from the last column
    int maxGold = 0;
    for (int i = 0; i < n; i++) {
      maxGold = Math.max(maxGold, dp[i][m - 1]);
    }
    
    return maxGold;
  }
}
