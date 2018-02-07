package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 289. Game of Life
 * 
 * @author czm
 *
 */
public class Sol_289 {
	
	public void gameOfLife(int[][] board) {
		
		if (board == null || board.length == 0)
			return;
		int row = board.length, col = board[0].length;
		
		
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				int lives = lives(board, i, j);
				
				if (board[i][j] == 0 && lives == 3)
					board[i][j] = 2;
				
				if (board[i][j] == 1 && lives >= 2 && lives <= 3)
					board[i][j] = 3;				
			}
		
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				board[i][j] >>= 1;
		
        
    }
	
	
	private int lives(int[][] board, int x, int y) {
		
		int lives = 0;
		
		for (int a = Math.max(0, x - 1); a <= Math.min(x + 1, board.length - 1); a++)
			for (int b = Math.max(0, y - 1); b <= Math.min(y + 1, board[0].length - 1); b++)
				lives += board[a][b] & 1;
		
		lives -= board[x][y] & 1;
		return lives;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
