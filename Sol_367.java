package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 367. Valid Perfect Square
 * 
 * @author czm
 * 
 *
 */
public class Sol_367 {
	
	public boolean isPerfectSquare(int num) {
		
		int i = 1;
		
		while (num > 0) {
			num -= i;
			if (num == 0)
				return true;
			i += 2;
		}
		return false;
        
    }

}
