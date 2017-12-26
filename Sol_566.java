package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 566. Reshape the Matrix
 * 
 * @author czm
 * 
 *
 */
public class Sol_566 {
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		
		int count = nums.length * nums[0].length;
		
		if (r * c != count)
			return nums;
		
		int[][] res = new int[r][c];
		
		for (int i = 0; i < count; i++) 
			res[i/c][i%c] = nums[i/nums[0].length][i%nums[0].length];

		return res;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
