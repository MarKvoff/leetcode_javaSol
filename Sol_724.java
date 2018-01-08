package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 724. Find Pivot Index
 * 
 * @author czm
 * 
 *
 */
public class Sol_724 {
	
	public int pivotIndex(int[] nums) {
		
		int sumFromRight = 0;
		
		for (int i : nums)
			sumFromRight += i;
		
		int sunFromLeft = 0;
		for (int i = 0; i < nums.length; i++) {
			sunFromLeft += nums[i];
			if (sunFromLeft == sumFromRight)
				return i;
			sumFromRight -= nums[i];
		}
		
		return -1;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
