package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 45. Jump Game II
 * 
 * @author czm
 * 
 *
 */
public class Sol_45 {
	
	public int jump(int[] nums) {
		if (nums.length == 1)
			return 0;
        
        int checkFromThisIndex = 1, endCheckIndex = nums[0], maxIndex = nums[0], jumps = 1;
        
        while (maxIndex < nums.length - 1) {
        		
            for (int i = checkFromThisIndex ; i <= endCheckIndex; i++) {
            		maxIndex = Math.max(maxIndex, i + nums[i]);
            	
            }
            
            checkFromThisIndex = endCheckIndex + 1;
            endCheckIndex = maxIndex;
            jumps++;
        }
        return jumps;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,3,1};
		Sol_45 solution = new Sol_45();
		System.out.println(solution.jump(nums));
		
	}

}
