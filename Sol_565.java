package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 565. Array Nesting
 * 
 * @author czm
 *
 */
public class Sol_565 {
	
	public int arrayNesting(int[] nums) {
		int maxLength = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > -1) {
				int next = nums[i];
				int now = i;
				int length = 1;
				while (next != i) {
					nums[now] = -1;
					length++;
					now = next;
					next = nums[next];
				}
				maxLength = Math.max(length, maxLength);
			}
		}
		
		return maxLength;
        
    }
	

}
