package solution;

public class RotateImage {
	
	public void rotate(int[][] matrix) {
		int row = matrix.length;
		int temp;
        System.out.println(row);
        for (int i = 0; i < row/2; i++) {
        	for (int j = 0; j < row; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[row-i-1][j];
				matrix[row-i-1][j] = temp;
			}
			
		}
        
        for (int i = 0; i < row; i++) {
        	for (int j = i+1; j < row; j++) {
        		temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
			
		}
        
        //output 
        for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);	
			}
			System.out.println();
		}
        
        
    }
}
