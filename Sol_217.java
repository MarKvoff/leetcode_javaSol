package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 217. Contains Duplicate
 * 
 * @author czm
 * 
 *
 */
public class Sol_217 {
	
	public boolean containsDuplicate(int[] nums) {
		
		HashSet<Integer> map = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.contains(nums[i]))
				return true;
			map.add(nums[i]);
			
			
		}
		
		return false;
		
		
		
		
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
