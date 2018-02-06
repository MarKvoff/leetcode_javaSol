package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 240. Search a 2D Matrix II
 * 
 * @author czm
 *
 */
public class Sol_240 {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		
		if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
	
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
