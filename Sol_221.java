package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 221. Maximal Square
 * 
 * @author czm
 *
 */
public class Sol_221 {
	
	public int maximalSquare(char[][] matrix) {
		
		
		if(matrix.length == 0) 
			return 0;
		
		int row = matrix.length, col = matrix[0].length;
		int[][] DP = new int[row+1][col+1];
		int max = 0;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (matrix[i-1][j-1] == '1') {
					DP[i][j] = Math.min(Math.min(DP[i-1][j], DP[i][j-1]), DP[i-1][j-1]) + 1;
					max = Math.max(max, DP[i][j]);
				}
			}
		}
		return max*max;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.valueOf('8'));

	}

}
