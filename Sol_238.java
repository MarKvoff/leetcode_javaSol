package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 238. Product of Array Except Self
 * 
 * @author czm
 *
 */


public class Sol_238 {
	
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int prod = 1;
		for (int i = 1; i < nums.length; i++) {
			prod *= nums[i-1];
			result[i] = prod;
		}
		prod = 1;
        result[0] = 1;
		for (int i = nums.length - 2; i > -1; i--) {
			prod *= nums[i+1];
			result[i] *= prod;
		}
		return result;
    }
	
}
