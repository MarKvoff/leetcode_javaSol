package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 594. Longest Harmonious Subsequence
 * 
 * @author czm
 * 
 *
 */
public class Sol_594 {
	
	public int findLHS(int[] nums) {
		
		int length = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : nums) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		
		for (int i : map.keySet()) {
			if (map.containsKey(i - 1))
				length = Math.max(length, map.get(i - 1) + map.get(i));
		}
		
		return length;
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
