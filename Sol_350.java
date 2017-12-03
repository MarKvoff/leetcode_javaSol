package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 350. Intersection of Two Arrays II
 * 
 * @author czm
 * 
 *
 */
public class Sol_350 {
	

	public int[] intersect(int[] nums1, int[] nums2) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i]))
				map.put(nums1[i], map.get(nums1[i]) + 1);
			else
				map.put(nums1[i], 1);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				res.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		
		int[] result = new int[res.size()];
		int j = 0;
		for (int i : res)
			result[j++] = i;
		
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
