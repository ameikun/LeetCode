package solution;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		int m = obstacleGrid.length,n = obstacleGrid[0].length;
		if (obstacleGrid == null||m ==0) {
			return 0;
		}
		int[][] dp=new int[m][n]; //dp[i][j]表示从start到[i,j]位置不同路径条
		
		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] != 1) {
				dp[0][i] = 1;
			}else {
				dp[0][i] = 0;
				break;
			}
		}
		
		for (int i = 1; i < m; i++) {
			if (obstacleGrid[i][0] != 1) {
				dp[i][0] = 1;
			}else {
				dp[i][0] = 0;
				break;
			}
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				
				if (obstacleGrid[i][j] == 0) {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];	
				}else {
					dp[i][j] = 0;
				}
				
			}
		}
		
		return dp[m-1][n-1];
	}

}
