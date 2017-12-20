package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 485. Max Consecutive Ones
 * 
 * @author czm
 * 
 *
 */
public class Sol_485 {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		
		int maxNum = Integer.MIN_VALUE;
		int localNum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				localNum++;
			else
				localNum = 0;
			maxNum = Math.max(localNum, maxNum);
		}
		
		return maxNum;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
