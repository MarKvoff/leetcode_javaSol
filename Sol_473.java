package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 117. Populating Next Right Pointers in Each Node II
 * 
 * @author czm
 *
 */
public class Sol_473 {
	
	public boolean makesquare(int[] nums) {
        
        if (nums == null || nums.length < 4)
            return false;
        
        int sum = 0;
        
        for (int i : nums)
            sum += i;
        
        if (sum % 4 != 0)
            return false;
        
        return dfs(nums, new int[4], 0, sum/4);
        
        
    }
    
    private boolean dfs(int[] nums, int[] sums, int index, int target) {
        
        if (index == nums.length) {
            if (sums[0] == target && sums[1] == target && sums[2] == target)
                return true;
            return false;
        }
        
        for (int i = 0; i < 4; i++) {
            if (sums[i] + nums[index] > target)
                continue;
            sums[i] += nums[index];
            if (dfs(nums, sums, index + 1, target))
                return true;
            sums[i] -= nums[index];
            
        }
        
        return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
