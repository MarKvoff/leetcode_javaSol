package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 96. Unique Binary Search Trees
 * 
 * @author czm
 * 
 *
 */
public class Sol_96 {
	
	public int numTrees(int n) {
		
		int[] Gn = new int[n + 1]; // unique BST with n different vals
		
		Gn[0] = 1;
		Gn[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			for(int j = 0; j < i; j++)
				Gn[i] += Gn[j] * Gn[i - j - 1];
		}
		
		return Gn[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
