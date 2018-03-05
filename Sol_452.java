package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 452. Minimum Number of Arrows to Burst Balloons
 * 
 * @author czm
 * 
 */
public class Sol_452 {

	public int findMinArrowShots(int[][] points) {
		
		if (points.length == 0) {
            return 0;
        }
        
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        int shoutCount = 1;
        int shotPos = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (shotPos < points[i][0]) {
                shoutCount++;
                shotPos = points[i][1];
            }
        }
        
        return shoutCount;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
