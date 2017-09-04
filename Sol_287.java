package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 287. Find the Duplicate Number
 * 
 * @author czm
 *
 */


public class Sol_287 {
	
	public int findDuplicate(int[] nums) {
		
		int target = nums[0];
		int lessThan = 0;
		int moreThan = 0;
		int equal = 0;
		int lo = 0;
		int hi = nums.length-1;
		
		while(true) {
			for (int i = 0; i < nums.length; i++) {
				
				if (target == nums[i])
					equal++;
				else if (target > nums[i])
					lessThan++;
				else
					moreThan++;
				
				if (equal > 1)
					return target;
		
				if (lessThan > target-1) {
					hi = target - 1;
					target = (lo+target)/2;
					break;
				}
				
				if (moreThan > nums.length-target) {
					lo = target + 1;
					target = (target+hi)/2;
					break;
					
				}	
			}
			lessThan = 0;
			moreThan = 0;
			equal = 0;
			lo = 0;
			hi = nums.length-1;
		}
    }
}
