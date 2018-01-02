package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 653. Two Sum IV - Input is a BST
 * 
 * @author czm
 * 
 *
 */
public class Sol_657 {
	
	public boolean judgeCircle(String moves) {
		
		int[] map = new int[4];
		char[] move = moves.toCharArray();
		
		for (char c : move) {
			if (c == 'R')
				map[0]++;
			if (c == 'L')
				map[1]++;
			if (c == 'U')
				map[2]++;
			if (c == 'D')
				map[3]++;
		}
		
		return map[0] == map[1] && map[2] == map[3] ? true : false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
