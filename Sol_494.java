package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 494. Target Sum
 * 
 * @author czm
 * 
 */
public class Sol_494 {
	
	private int count;
    public int findTargetSumWays(int[] nums, int S) {
        count = 0;
        dfs(nums, 0, S);
        return count;
    }
    
    private void dfs(int[] nums, int index, int S) {
        
        if (index == nums.length && S == 0)
            count++;
        
        if (index == nums.length)
            return;
        
        for (int i = -1; i < 2; i +=2) {
            
            S = S - i*nums[index];
            dfs(nums, index + 1, S);
            S =  S + i*nums[index];
            
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
