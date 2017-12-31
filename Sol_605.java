package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 605. Can Place Flowers
 * 
 * @author czm
 * 
 *
 */
public class Sol_605 {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		
		int rst = n;
		
		for (int i = 0; i < flowerbed.length && rst > 0;) {
			if (flowerbed[i] == 1)
				i =+ 2;
			else {
				int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
				int prev = (i == 0) ? 0 : flowerbed[i - 1];
				if (next == 0 && prev == 0) {
	            		flowerbed[i] = 1;
	            		rst--;
				}
				i++;
			}
		}
		
		if (rst > 0)
			return false;
		return true;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
