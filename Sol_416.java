package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 416. Partition Equal Subset Sum
 * 
 * @author czm
 * 
 */
public class Sol_416 {
	
	public boolean canPartition(int[] nums) {
		
		if (nums.length == 0 || nums == null)
            return true;
        
        int sum = 0;
        
        for (int i : nums)
            sum += i;
        
        if (sum % 2 == 1)
            return false;
        
        int val = sum / 2;
        
        boolean[] dp = new boolean[val + 1];
        
        dp[0] = true;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = val; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
                
            }
        }
        
        
        return dp[val];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
