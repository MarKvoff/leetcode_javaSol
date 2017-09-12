package leetcode_sol;


/**
 * This is the solution for problems in leetcode.com
 * Question 63. Unique Paths II
 *
 * 
 * @author ZHEMIN_CHEN
 * 
 *
 */
public class Sol_63 {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        
        int[][] path = new int[m][n];
        path[0][0] = (obstacleGrid[0][0] == 1) ? 0 : 1;

        
        
        for (int i = 1; i < n; i++){
            if (obstacleGrid[0][i] == 1)
                path[0][i] =0;
            else
                path[0][i] += path[0][i-1];
                
        }
        
        for (int i = 1; i < m; i++)
            if (obstacleGrid[i][0] == 1)
                path[i][0] = 0;
            else
                path[i][0] += path[i-1][0];
        
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (obstacleGrid[i][j] == 1)
                path[i][0] = 0;
                else
                path[i][j] += path[i-1][j] + path[i][j-1];
        
        return path[m-1][n-1];
        
        
    }



}
