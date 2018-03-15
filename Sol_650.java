package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 650. 2 Keys Keyboard
 * 
 * @author czm
 * 
 *
 */
public class Sol_650 {
	
	public int minSteps(int n) {
        
        if (n == 1)
            return 0;
        if (n == 2 || n == 3)
            return n;
        
        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 2;
        dp[3] = 3;
        
        for (int i = 4; i <= n; i++) {
            
            int divid = 2;
            
            while(i % divid != 0)
                divid++;
            
            dp[i] = dp[i/divid] + divid;
            
        }
        
        return dp[n];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
