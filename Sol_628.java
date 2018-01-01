package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 628. Maximum Product of Three Numbers
 * 
 * @author czm
 * 
 *
 */
public class Sol_628 {
	
	public int maximumProduct(int[] nums) {
		
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		
		for (int i : nums) {
			
			if (i > max1) {
				max3 = max2;
				max2 = max1;
				max1 = i;
			} else if (i > max2) {
				max3 = max2;
				max2 = i;
			} else if (i > max3)
				max3 = i;
			
			if (i < min1) {
				min2 = min1;
				min1 = i;
			} else if (i < min2)
				min2 = i;			
			
		}
		
		return Math.max(max1 * max2 * max3, max1 * min1 * min2);
        
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
