package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 322. Coin Change
 * 
 * @author czm
 * 
 */
public class Sol_322 {
	
	public static int coinChange(int[] coins, int amount) {
		
		int[] dp = new int[amount + 1];
		
		for (int coin : coins) {
			if (coin < amount)
				dp[coin] = 1;
			if (coin == amount)
				return 1;
		}
		
		for (int i = 1; i <= amount; i++)  {
			if (dp[i] != 1) {
				System.out.println("enter dp[" + i + "]");
				dp[i] = -1;
				int j = i - 1;
				int minCoin = Integer.MAX_VALUE;
			
				while (j >= i/2 && j > 0) {
					if (dp[j] != -1 && dp[i - j] != -1)
						minCoin = Math.min(minCoin, dp[j] + dp[i - j]);
					j--;
				}
			
				if(minCoin != Integer.MAX_VALUE)
					dp[i] = minCoin;
			}
		}
		
		for (int x : dp)
			System.out.print(x + ", ");
		
		return dp[amount];
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2};
		
		Sol_322.coinChange(coins, 11);

	}

}
