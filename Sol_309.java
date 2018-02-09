package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 309. Best Time to Buy and Sell Stock with Cooldown
 * 
 * @author czm
 * 
 */
public class Sol_309 {
	
	public int maxProfit(int[] prices) {
		
		if (prices.length <= 1)
            return 0;
        
        int profitSell = 0, sellBefore = 0, buy = -prices[0];
		
		for (int i = 1; i < prices.length; i++) {
			
			int preSell = profitSell;
			profitSell = Math.max(buy + prices[i], profitSell);
			
			buy = Math.max(sellBefore - prices[i], buy);
			sellBefore = preSell;
			
		}
		
		return profitSell;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
