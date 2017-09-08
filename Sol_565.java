package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 565. Array Nesting
 * 
 * @author czm
 *
 */
public class Sol_565 {
	
	public static int arrayNesting(int[] nums) {
		int maxLength = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > -1) {
				int now = i;
				int length = 0;
				while (nums[now] > -1) {
					int next = nums[now];
					nums[now] = -1;
					length++;
					now = next;
				}
				maxLength = Math.max(length, maxLength);
			}
        }
		return maxLength;
    }
	
	public static void main(String[] args) {
		int[] a = {1,0,2};
		System.out.println(Sol_565.arrayNesting(a));
		
	}
	

}
