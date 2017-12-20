package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 461. Hamming Distance
 * 
 * @author czm
 * 
 *
 */
public class Sol_461 {
	
	public int hammingDistance(int x, int y) {
		
		return Integer.bitCount(x ^ y);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
