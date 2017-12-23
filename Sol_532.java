package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 532. K-diff Pairs in an Array
 * 
 * @author czm
 * 
 *
 */
public class Sol_532 {
	
	public int findPairs(int[] nums, int k) {
		
		int counts = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : nums)
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		
		for (int i : map.keySet()) {
			if (k == 0) {
				if (map.get(i) > 1)
					counts++;
			} else if (k > 0)
				if (map.containsKey(i + k))
					counts++;
		}
		
		return counts;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
