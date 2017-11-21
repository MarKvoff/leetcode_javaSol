package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 204. Count Primes
 * 
 * @author czm
 * 
 *
 */
public class Sol_204 {
	
	public int countPrimes(int n) {
		
		boolean[] notPrimes = new boolean[n];
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			if (notPrimes[i] == false) {
				count++;
				for (int j = 2; i*j < n; j++)
					notPrimes[i*j] = true;
			}	
		}
		
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] list = new boolean[3];
		
		//boolean i;
		for (Object i : list) {
			System.out.println(i);
			
		}

	}

}
