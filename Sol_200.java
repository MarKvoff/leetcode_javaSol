package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 200. Number of Islands
 * 
 * @author czm
 * 
 *
 */
public class Sol_200 {
	
	public int numIslands(char[][] grid) {
		
		int count = 0;
		
		for (int i = 0; i < grid.length; i++) 
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					isLand(grid, i, j);
				}
			}
		
        return count;
    }
	
	private void isLand(char[][] grid, int i, int j) {
		
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
			return;
		
		if (grid[i][j] == '1') {
			grid[i][j] = '0';
			isLand(grid, i + 1, j);
			isLand(grid, i - 1, j);
			isLand(grid, i, j + 1);
			isLand(grid, i, j - 1);
		}
		
		return;
		
	}

}
