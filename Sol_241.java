package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 241. Different Ways to Add Parentheses
 * 
 * @author czm
 *
 */
public class Sol_241 {
	
	public List<Integer> diffWaysToCompute(String input) {
		
		List<Integer> res = new LinkedList<Integer>();
		
		if (isDigit(input)) {
			res.add(Integer.valueOf(input));
			return res;
		}
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
				String front = input.substring(0, i);
				String end = input.substring(i + 1, input.length());
				List<Integer> first = diffWaysToCompute(front);
				List<Integer> last = diffWaysToCompute(end);
				
				for (int p : first)
					for (int q : last) {
						if (input.charAt(i) == '+')
							res.add(p + q);
						if(input.charAt(i) == '-')
							res.add(p - q);
						if (input.charAt(i) == '*')
							res.add(p * q);
					}
				
			}
			
		}
		
		return res;
        
    }
	
	private boolean isDigit(String input) {
		
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i)))
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
