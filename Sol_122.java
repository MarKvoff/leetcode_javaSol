package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 122. Best Time to Buy and Sell Stock II
 * 
 * @author czm
 * 
 *
 */
public class Sol_122 {
	
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length-1; i++){
            if (prices[i] < prices[i+1])
                maxProfit = maxProfit + prices[i+1] - prices[i];
        }
        
        return maxProfit;
    }

}
