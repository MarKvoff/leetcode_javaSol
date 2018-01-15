package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 36. Valid Sudoku
 * 
 * @author czm
 * 
 *
 */
public class Sol_36 {
	
	public boolean isValidSudoku(char[][] board) {
		
		for (int i = 0; i < 9; i++) {
			HashSet<Character> row = new HashSet<Character>();
			HashSet<Character> column = new HashSet<Character>();
			HashSet<Character> cubic = new HashSet<Character>();
			
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !row.add(board[i][j]))
					return false;
				if (board[j][i] != '.' && !column.add(board[j][i]))
					return false;
				
				int cubicI = 3 * (i/3) + j/3;
				int cubicJ = 3 * (i%3) + j%3;
				
				if (board[cubicI][cubicJ] != '.' && !cubic.add(board[cubicI][cubicJ]))
					return false;
			}
		}
		
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
