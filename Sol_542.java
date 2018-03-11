package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 542. 01 Matrix
 * 
 * @author czm
 * 
 *
 */
public class Sol_542 {
	
	public int[][] updateMatrix(int[][] matrix) {
		
		int m = matrix.length, n = matrix[0].length;
        int[][] dis = new int[m][n];
        
        Queue<int[]> zeros = new LinkedList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0)
                    zeros.offer(new int[] {i, j});
                else
                    dis[i][j] = Integer.MAX_VALUE;
        
        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!zeros.isEmpty()) {
            int[] cell = zeros.poll();
            for (int[] di : directions) {
                int i = cell[0] + di[0];
                int j = cell[1] + di[1];
                if (i < 0 || i >= m || j < 0 || j >= n || dis[i][j] <= dis[cell[0]][cell[1]] + 1)
                    continue;
                zeros.add(new int[] {i, j});
                dis[i][j] = dis[cell[0]][cell[1]] + 1;
                
            }
            
        }
        
        return dis;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
