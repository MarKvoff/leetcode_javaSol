package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 264. Ugly Number II
 * 
 * @author czm
 *
 */
public class Sol_264 {
	
	
	public static int nthUglyNumber(int n) {
		
		if (n == 1)
			return 1;
		
		int[] store = new int[n];
		store[0] = 1;
		
		int index2 = 0, index3 = 0, index5 = 0;
		int val2 = 2, val3 = 3, val5 = 5;
		
		int pos = 1;
		while(pos < n) {
			
			val2 = 2 * store[index2];
			val3 = 3 * store[index3];
			val5 = 5 * store[index5];
			
			int val = Math.min(Math.min(val2, val3), val5);
			store[pos] = val;
			
			if (val == val2)
				index2++;
			if (val == val3)
				index3++;
			if (val == val5)
				index5++;
			
			pos++;
		}
		for (int i : store)
			System.out.print(i + ", ");
		return store[n - 1];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sol_264.nthUglyNumber(10);
		

	}

}
