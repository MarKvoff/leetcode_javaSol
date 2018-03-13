package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 583. Delete Operation for Two Strings
 * 
 * @author czm
 * 
 *
 */
public class Sol_646 {
	
	public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        int max = 0;
        
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i - 1][1] < pairs[i][0])
                dp[i] = dp[i - 1] + 1;
            else
                for (int j = i - 2; j >= 0; j--)
                    if (pairs[j][1] < pairs[i][0]) {
                        dp[i] = dp[j] + 1;
                        break;
                    }
            max = Math.max(max, dp[i]);
            
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
