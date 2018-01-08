package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 746. Min Cost Climbing Stairs
 * 
 * @author czm
 * 
 *
 */
public class Sol_746 {
	
	public int minCostClimbingStairs(int[] cost) {
		
		int a = cost[0];
		int b = cost[1];
		
		int result = Math.min(a, b);
		
		for (int i = 2; i <= cost.length; i++) {
			
			int nowCost = i == cost.length ? 0 : cost[i];
			result = Math.min(a + nowCost, b + nowCost);
			a = b;
			b = result;	
		}
		return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
