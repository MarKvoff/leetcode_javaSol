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
        
        int maxStep = nums[0], nowIndex = 0, jumps = 1;
        
        
        while (maxStep < nums.length - 1) {
            for (int i = maxStep; i > nowIndex; i--)
                maxStep = Math.max(maxStep, i + nums[i]);
            nowIndex = maxStep;
            System.out.println(nowIndex);
            jumps++;
            
            
            
        }
        
        return jumps;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,1,1,2,4,1,1,1,1,4};
		Sol_45 solution = new Sol_45();
		
		
		
		System.out.println(solution.jump(nums));
		
		
	}

}
