package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 198. House Robber
 * 
 * @author czm
 * 
 *
 */
public class Sol_198 {
	
	public static int rob(int[] nums) {
        
        int noRobLast = 0, RobLast = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int tmp = RobLast;
            RobLast = noRobLast + nums[i];
            noRobLast = Math.max(tmp, noRobLast);
            
        }
        
        return Math.max(noRobLast, RobLast);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {2,1,1,3,1,2,4,5,7,1,1,9};
		
		System.out.println(Sol_198.rob(test));
		

	}

}
