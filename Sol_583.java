package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 583. Delete Operation for Two Strings
 * 
 * @author czm
 * 
 *
 */
public class Sol_583 {
	
	public int minDistance(String word1, String word2) {
		
		int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;
        
        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);                
                
                maxLen = Math.max(dp[i][j], maxLen);
            }
        
        return word1.length() - maxLen + word2.length() - maxLen;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
