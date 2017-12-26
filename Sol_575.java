package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 575. Distribute Candies
 * 
 * @author czm
 * 
 *
 */
public class Sol_575 {
	
	public int distributeCandies(int[] candies) {
		
		Set<Integer> kinds= new HashSet<Integer>();
		
		for (int i : candies)
			kinds.add(i);
		
		return Math.min(candies.length/2, kinds.size());
		
		
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
