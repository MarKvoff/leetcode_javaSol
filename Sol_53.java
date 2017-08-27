package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 53. Maximum Subarray
 * 
 * @author czm
 *
 */

public class Sol_53 {
	
	public static int maxSubArray(int[] nums) {
		int sum = nums[0];
		int pos = nums[0];
		
		
		for (int i = 1; i < nums.length; i++) {
			pos = Math.max(pos + nums[i], nums[i]);
			System.out.println("pos = " + pos);
			sum =  Math.max(pos, sum);
			System.out.println("sum = " + sum);
		}
		return sum;
    }
	
	
	public static int maxSubArray2(int[] nums) {
		int sum = nums[0];
		int end = nums[0];
		
		for (int i = 1; i < nums.length; i ++) {
			//if (sum )
			
			
			
			
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {100 ,-30, -4,200};
		Sol_53.maxSubArray(a);
		
		
		

	}

}
