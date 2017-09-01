package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 79. Word Search
 * 
 * @author czm
 *
 */


//under solving
public class Sol_79 {						
		
	public boolean exist(char[][] board, String word) {
		
		int m = board.length;
		int n = board[0].length;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (findWord(i, j, word, board, 0))
					return true;
			}
		}
		return false;
    	}
	
	private boolean findWord(int i, int j, String word, char[][] board, int pos){
		if (word.length() == pos)//find the word
			return true;
		if (i == board.length || i < 0 || j < 0 || j == board[0].length)//exceed the boundary
			return false;
		if (board[i][j] != word.charAt(pos))//mismatch
			return false;
		else {
			char tmp = board[i][j];
			board[i][j] = 0;
			if (findWord(i, j+1, word, board, pos+1))
				return true;
			else if (findWord(i, j-1, word, board, pos+1))
				return true;
			else if (findWord(i+1, j, word, board, pos+1))
				return true;
			else if (findWord(i-1, j, word, board, pos+1))
				return true;
			else
				board[i][j] = tmp;
				return false;
		}
	}


}
