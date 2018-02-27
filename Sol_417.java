package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 417. Pacific Atlantic Water Flow
 * 
 * @author czm
 * 
 */
public class Sol_417 {
	
	public List<int[]> pacificAtlantic(int[][] matrix) {
		
		List<int[]> res = new LinkedList<int[]>();
        
		int row = matrix.length;
        
        if (row == 0)
            return res;
        
        int col = matrix[0].length;
        
        boolean[][] canPac = new boolean[row][col];
        boolean[][] canAtl = new boolean[row][col];
        
        
        for (int i = 0; i < col; i++) {
            canReach(matrix, canPac, 0, i);
            canReach(matrix, canAtl, row - 1, i);
        }
        
        for (int i = 0; i < row; i++) {
            canReach(matrix, canPac, i, 0);
            canReach(matrix, canAtl, i, col - 1);
        }
        
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (canPac[i][j] && canAtl[i][j]) {
                    int[] point = {i, j};
                    res.add(point);
                }

        
        return res;
		
        
    }
	
	private void canReach(int[][] matrix, boolean[][] canReach, int i, int j) {
        
		int row = matrix.length, col = matrix[0].length;
        canReach[i][j] = true;
        
        if (i + 1 < row && matrix[i + 1][j] >= matrix[i][j] && canReach[i + 1][j] == false)
            canReach(matrix, canReach, i + 1, j);
        if (i - 1 >= 0 && matrix[i - 1][j] >= matrix[i][j] && canReach[i - 1][j] == false)
            canReach(matrix, canReach, i - 1, j);
        if (j + 1 < col && matrix[i][j + 1] >= matrix[i][j] && canReach[i][j + 1] == false)
            canReach(matrix,  canReach, i, j + 1);
        if (j - 1 >= 0 && matrix[i][j - 1] >= matrix[i][j] && canReach[i][j - 1] == false)
            canReach(matrix, canReach, i, j - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
