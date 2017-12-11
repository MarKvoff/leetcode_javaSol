package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 414. Third Maximum Number
 * 
 * @author czm
 * 
 *
 */
public class Sol_414 {
	
	public int thirdMax(int[] nums) {
		
		Integer one = null, two = null, three = null;
		
		for (Integer n : nums) {
            if (n.equals(one) || n.equals(two) || n.equals(three))
                continue;
			if (one == null || n >= one ) {
				three = two;
				two = one;
				one = n;
			} else if (two == null || n >= two) {
				three = two;
				two = n;
			} else if (three == null || n >= three) {
				three =n;
			}
			
		}
		
		return three == null ? one : three;		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);

	}

}
