package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 413. Arithmetic Slices
 * 
 * @author czm
 * 
 */
public class Sol_413 {
	
	public int numberOfArithmeticSlices(int[] A) {
		
		int curr = 0, max = 0;
		
		for (int i = 2; i < A.length; ) {
			
			if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
				curr++;
				max += curr;
				
			} else
				curr = 0;
			
		}
		
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
