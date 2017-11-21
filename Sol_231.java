package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 231. Power of Two
 * 
 * @author czm
 * 
 *
 */
public class Sol_231 {
	
	public boolean isPowerOfTwo(int n) {
		
		return n > 0 && Integer.bitCount(n) == 1;
        
    }

}
