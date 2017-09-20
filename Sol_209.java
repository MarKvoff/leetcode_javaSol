package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 209. Minimum Size Subarray Sum
 * 
 * @author czm
 * 
 *
 */
public class Sol_209 {
	
	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null)
			return 0;
		
		int front = 0, end = -1;
		int sum = 0, minDis = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (sum < s) {
				sum += nums[i];
				end++;
			}
			
			if (sum >= s) {
				while (sum >= s) {
					minDis = Math.min(minDis, end - front +1);
					sum -= nums[front++];
				}
				front--;	
				sum += nums[i];
				end++;
			}
			
		}
		
		if (sum < s)
			return 0;
		
		return minDis;
    }
	
	public static void main(String[] args) {
		int[] nums = {10,2,3};
		Sol_209 solution = new Sol_209();
		
		
		
		System.out.println(solution.minSubArrayLen(6, nums));
		
		
	}

}
