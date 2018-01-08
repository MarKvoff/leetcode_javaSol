package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 695. Max Area of Island
 * 
 * @author czm
 * 
 *
 */
public class Sol_695 {
	
	public int maxAreaOfIsland(int[][] grid) {
		
		int maxArea = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int area = 0;
				if (grid[i][j] == 1) {
					area = findArea(grid, i, j);
					maxArea = Math.max(maxArea, area);
				}
			}
		}
		
		return maxArea;
    }
	
	private int findArea(int[][] grid, int a, int b) {
		
		if (a < 0 || b < 0 || a >= grid.length || b >= grid[0].length)
			return 0;
		
		if (grid[a][b] == 1) {
			grid[a][b] = 0;
			return 1 + findArea(grid, a, b + 1) + findArea(grid, a, b - 1) + findArea(grid, a + 1, b) + findArea(grid, a - 1, b);
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
