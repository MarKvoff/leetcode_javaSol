import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 120. Triangle
 * 
 * @author czm
 *
 */
public class Sol_120 {
	
	public int minimumTotal(List<List<Integer>> triangle) {
		
		int N = triangle.size();
		int[] minPath = new int[N];
		List<Integer> Path_down = triangle.get(N-1);
		
		for (int i = 0; i < N; i++)
			minPath[i] = Path_down.get(i);
			
        for (int i = N-2; i > -1; i--){
        	  List<Integer> Path_up = triangle.get(i);
        	  for (int j = 0; j <= i; j++)
        		  minPath[j] = Math.min(minPath[j], minPath[j+1]) + Path_up.get(j);
        }
        
        return minPath[0];
    }

}
