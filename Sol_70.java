package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 70. Climbing Stairs
 * 
 * @author czm
 * 
 *
 */
public class Sol_70 {
	
	public int climbStairs(int n) {
        
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        
        int ways = 0, dis = 3;
        int n_1 = 2, n_2 = 1;
        
        while (dis <= n) {
            ways = n_1 + n_2;
            dis++;
            n_2 = n_1;
            n_1 = ways;
        }
        return ways;
    }
	

}
