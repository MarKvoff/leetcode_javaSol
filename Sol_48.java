package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 48. Rotate Image
 * 
 * @author czm
 * 
 *
 */
public class Sol_48 {
	
	public void rotate(int[][] matrix) {
		
		// first swap with diagional
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = i + 1; j < matrix.length; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		
		int columLo = 0, columHi = matrix.length - 1;
		
		while (columLo < columHi) {
			for (int i = 0; i < matrix.length; i++) {
				int tmp = matrix[i][columLo];
				matrix[i][columLo] = matrix[i][columHi];
				matrix[i][columHi] = tmp;
			}
			columLo++;
			columHi--;
			
		}
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
