package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 300. Longest Increasing Subsequence
 * 
 * @author czm
 * 
 */
public class Sol_300 {
	
	public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
			return 0;
		
		int[] dp = new int[nums.length];
		
		dp[0] = 1;
        int max = 1;
        
		for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] > nums[j])
					dp[i] = Math.max(dp[i], 1 + dp[j]);
			}
            
			max = Math.max(max, dp[i]);
		}
		
		return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
