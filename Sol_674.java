package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 674. Longest Continuous Increasing Subsequence
 * 
 * @author czm
 * 
 *
 */
public class Sol_674 {
	
	public int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0)
            return 0;
		
		int length = 1;
		int maxLen = 1;
		
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i-1]) {
				length++;
				maxLen = Math.max(maxLen, length);
			}
			else
				length = 1;
		}
		
		return maxLen;
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
