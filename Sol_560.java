package leetcode_sol;

import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 560. Subarray Sum Equals K
 * 
 * @author czm
 *
 */
public class Sol_560 {
	
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		
		//In this map the key is the sum, the value is the total number of the cumulative sum appears;
		HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
		sums.put(0, 1);
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sums.containsKey(sum - k))
				count += sums.get(sum-k);
			sums.put(sum, sums.getOrDefault(sum, 0) + 1);	
		}
		return count;
    }

}
