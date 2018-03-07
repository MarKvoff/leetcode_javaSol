package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 474. Ones and Zeroes
 * 
 * @author czm
 * 
 */
public class Sol_474 {
	
	public int findMaxForm(String[] strs, int m, int n) {
        
        int[][] dp = new int[m+1][n+1];
        
        for (String str : strs) {
            int zeros = 0, ones = 0;
            
            for (char c : str.toCharArray())
                if (c == '0')
                    zeros++;
                else
                    ones++;
            
            for (int i = m; i >= zeros; i--)
                for (int j = n; j >= ones; j--)
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
        }
        
        return dp[m][n];

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
