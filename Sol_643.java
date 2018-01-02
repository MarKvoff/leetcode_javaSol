package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 643. Maximum Average Subarray I
 * 
 * @author czm
 * 
 *
 */
public class Sol_643 {
	
	public double findMaxAverage(int[] nums, int k) {
		
		double result = 0;
		double maxAve = 0;
		
		for (int i = 0; i < k; i++)
			result +=nums[i];
		maxAve = result/k;
		
		for (int i = k; i < nums.length; i++) {
			result += nums[i] - nums[i - k];
			maxAve = Math.max(maxAve, result/k);
		}
		
		return maxAve;
		   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
