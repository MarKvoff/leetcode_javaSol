package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 525. Contiguous Array
 * 
 * @author czm
 * 
 *
 */
public class Sol_525 {
	
	public int findMaxLength(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        
        int diff = 0, max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            diff += nums[i] == 1 ? 1 : -1;
            
            if (map.containsKey(diff))
                max = Math.max(max, i - map.get(diff));
            else
                map.put(diff, i);
            
        }
        
        return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
