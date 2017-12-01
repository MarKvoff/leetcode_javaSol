package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 349. Intersection of Two Arrays
 * 
 * @author czm
 * 
 *
 */
public class Sol_349 {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> intersection = new HashSet<Integer>();
		
		for (int i : nums1)
			set.add(i);
		
		for (int i : nums2)
			if (set.contains(i))
				intersection.add(i);
		
		int[] result = new int[intersection.size()];
		int d = 0;
		for (int i : intersection)
			result[d++] = i;
		
		return result;
		
    }

}
