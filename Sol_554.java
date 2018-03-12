package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 554. Brick Wall
 * 
 * @author czm
 * 
 *
 */
public class Sol_554 {
	
	public int leastBricks(List<List<Integer>> wall) {
	        
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        for (List<Integer> list : wall) {
	        		int sum = 0;
	            for (int i = 0; i < list.size() - 1; i++) {
	            		sum += list.get(i);
	            		map.put(sum, map.getOrDefault(sum, 0) + 1);
	            }
	        }
	        
	        int max = 0;
	        
	        for (int i : map.values())
	            max = Math.max(max, i);
	        return wall.size() - max;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
