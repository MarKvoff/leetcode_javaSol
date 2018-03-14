package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 647. Palindromic Substrings
 * 
 * @author czm
 * 
 *
 */
public class Sol_647 {
	
	public int countSubstrings(String s) {
        
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++)
            dp[i][i] = true;
        
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++) {
                
                if (j == i + 1)
                    dp[i][j] = s.charAt(i) == s.charAt(i + 1) ? true : false;
                else
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(i + 1);
                
            }
        
        int count = 0;
        
        for (int i = 0; i < len; i++)
            for (int j = i; j < len; j++)
                count += dp[i][j] ? 1 : 0;
        
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
