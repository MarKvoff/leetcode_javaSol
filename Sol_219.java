package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 219. Contains Duplicate II
 * 
 * @author czm
 * 
 *
 */
public class Sol_219 {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if (i > k) set.remove(nums[i-k-1]);
			if (set.contains(nums[i])) 
				return true;
			set.add(nums[i]);
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
