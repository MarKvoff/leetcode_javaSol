package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 494. Target Sum
 * 
 * @author czm
 * 
 */
public class Sol_494 {
	
	public int findTargetSumWays(int[] nums, int S) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            
            if (!map.isEmpty()) {
            		Set<Integer> set = new HashSet<Integer>();
                for (Integer key : map.keySet()) {
                		map.put(key + i, map.getOrDefault(key + i, 0) + 1);
                		map.put(key - i, map.getOrDefault(key - i, 0) + 1);
                }     
                
            } else {
            		map.put(i, 1);
            		map.put(-i, 1);
            }
        }
        
        return map.getOrDefault(S, 0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
