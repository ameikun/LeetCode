package solution;

public class UniquePaths {
	/**
	 * 首先想到的是递归，但是递归效率太慢，超时
	 * 换动态规划，也算典型的动态规划的题*/
	public int uniquePaths(int m, int n) {

		int[][] f = new int[m][n];
		for (int i = 0; i < m; i++) {
			f[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			f[0][i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				f[i][j] = f[i-1][j]+f[i][j-1];
			}
		}
		return f[m-1][n-1];
	}

}
