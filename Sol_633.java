package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 633. Sum of Square Numbers
 * 
 * @author czm
 * 
 *
 */
public class Sol_633 {
	
	public boolean judgeSquareSum(int c) {
		
		int low = 0, hi = (int)Math.sqrt(c);
		
		while (low <= hi) {
			int num = low * low + hi * hi;
			
			if (num > c)
				hi--;
			else if (num < c)
				low++;
			else
				return true;
		}
		
		return false;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
