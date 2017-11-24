package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 268. Missing Number
 * 
 * @author czm
 * 
 *
 */
public class Sol_268 {
	
	public int missingNumber(int[] nums) {
		
		int missing = 0^nums[0];
		
		for (int i = 1; i < nums.length; i++)
			missing = missing ^ nums[i] ^ i;
		
		return missing ^ nums.length;
        
    }

}
