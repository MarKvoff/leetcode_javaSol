package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 121. Best Time to Buy and Sell Stock
 * 
 * @author czm
 *
 */



public class Sol_121 {
	
	public int maxProfit(int[] prices) {
		int minPriceIndex = 0;
		int maxprofit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			if (prices[minPriceIndex] > prices[i])
				minPriceIndex = i;
			if (minPriceIndex < i)
				maxprofit = Math.max(maxprofit, prices[i] - prices[minPriceIndex]);
		}
		return maxprofit;
    }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
