package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 377. Combination Sum IV
 * 
 * @author czm
 * 
 */
public class Sol_377 {
	
	/*
	public static int combinationSum4(int[] nums, int target) {
		
		if (target == 0)
			return 1;
		
		int combo = 0;
		
		for (int i : nums)
			if (i <= target)
				combo += combinationSum4(nums, target - i);
		
		return combo;
        
    }
	*/
	
	
	public static int combinationSum4(int[] nums, int target) {
		
		int[] dp = new int[target + 1];
		
		dp[0] = 1;
		
		for (int i = 1; i <= target; i++) {
			
			for (int j : nums) {
				if (j <= i)
					dp[i] += dp[i - j];
			}
			
		}
		
		return dp[target];
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Sol_377.combinationSum4(nums, 10));

	}

}
