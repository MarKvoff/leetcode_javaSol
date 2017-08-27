package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 53. Maximum Subarray
 * 
 * @author czm
 *
 */

public class Sol_53 {
	
	
	//the following is the O(n) solution
	public int maxSubArray(int[] nums) {
		int sum = nums[0];
		int pos = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			pos = Math.max(pos + nums[i], nums[i]);
			sum =  Math.max(pos, sum);
		}
		return sum;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
