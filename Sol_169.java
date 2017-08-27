package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 169. Majority Element
 * 
 * @author czm
 *
 */


public class Sol_169 {
	
	public int majorityElement(int[] nums) {
		int major = nums[0];
		int count = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if (count == 0)
				major = nums[i];
			if (major != nums[i])
				count--;
			else
				count++;
		}
		return major;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
