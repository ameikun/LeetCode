package solution;

import java.util.ArrayList;
import java.util.List;


/**
 * 51. N-Queens
 */
public class NQueens {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<>();
		int[][] s = new int[n][n];
		formQueens(n, 0, s,res);
		return res;
	}

	public void formQueens(int n, int row, int[][] s,List<List<String>> result) {
		if (row == n) {
			result.add(new ArrayList<>(change(s)));
			return;
		} else {
			for (int j = 0; j < n; j++) {
				if (s[row][j] == 0) {
					int[][] temp = new int[n][n];
					for (int i = 0; i < n; i++) {
						for (int k = 0; k < n; k++) {
							temp[i][k] = s[i][k];
						}
					}
					
					// 对应行列设为1
					for (int t = 0; t < n; t++) {
						s[row][t] = 1;
						s[t][j] = 1;
					}
					s[row][j] = 2;
					// 对角线设为1
					for (int i = 1; i < n; i++) {
						if ((row+i)<n && (j+i)<n) {
							s[row + i][j + i] = 1;
						}
						
						if ((row - i) >= 0 && (j+i)<n) {
							s[row - i][j + i] = 1;
						}
						if ((j - i) >= 0 && (row+i)<n) {
							s[row + i][j - i] = 1;
						}
						if ((row - i) >= 0 && (j - i) >= 0) {
							s[row - i][j - i] = 1;
						}			
					}
										

					formQueens(n, row + 1, s,result);
					for (int i = 0; i < n; i++) {
						for (int k = 0; k < n; k++) {
							s[i][k] = temp[i][k];
						}
					}
				}

			}
		}
	}

	
	public List<String> change(int[][] s) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			String tempS = "";
			for (int j = 0; j < s.length; j++) {
				if (s[i][j] == 1) {
					tempS = tempS + ".";
				} else {
					tempS = tempS + "Q";
				}	
			}
			result.add(tempS);
		}
		return result;
	}

}
