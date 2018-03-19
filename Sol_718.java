package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 718. Maximum Length of Repeated Subarray
 * 
 * @author czm
 * 
 *
 */
public class Sol_718 {
	
	public int findLength(int[] A, int[] B) {
        
        int aL = A.length, bL = B.length;
        
        int[][] dp = new int[aL + 1][bL + 1];
        int maxLen = 0;
        
        for (int i = 0; i <= aL; i++)
            for (int j = 0; j <= bL; j++) {
                if ( i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (A[i - 1] == B[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 0;
                
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        
        return maxLen;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
