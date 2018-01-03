package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 665. Non-decreasing Array
 * 
 * @author czm
 * 
 *
 */
public class Sol_665 {
	
	public static boolean checkPossibility(int[] nums) {
        
        int move = 0;
		
		for (int i = 0; i < nums.length - 1 && move <= 2; i++) {
			if (nums[i] > nums[i + 1]) {
				move++;
				if (i == 0 || nums[i - 1] <= nums[i+ 1])
					nums[i] =nums[i + 1];
				else
					nums[i+1] = nums[i];
			}
		}
		
		return move < 2;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = {1,3,5,2,4};
		Sol_665.checkPossibility(sample);

	}

}
