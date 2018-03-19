package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 714. Best Time to Buy and Sell Stock with Transaction Fee
 * 
 * @author czm
 * 
 *
 */
public class Sol_714 {
	
	public int maxProfit(int[] prices, int fee) {
        
        if (prices == null || prices.length == 1)
			return 0;
		
		int days = prices.length;
		int[] hold = new int[days]; // max profit end that day with holding stock
		int[] nothold = new int[days]; // max profit end that day not holding stock
		
		hold[0] = -prices[0];
		nothold[0] = 0;
		
		for (int i = 1; i < prices.length; i++) {
		    hold[i] = Math.max(hold[i - 1], nothold[i - 1] - prices[i]);
            nothold[i] = Math.max(nothold[i - 1], hold[i - 1] + prices[i] - fee);
		}
            
        return nothold[days - 1]; 
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
