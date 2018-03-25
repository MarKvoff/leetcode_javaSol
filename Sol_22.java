package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 22. Generate Parentheses
 * 
 * @author czm
 *
 */
public class Sol_22 {
	
	public List<String> generateParenthesis(int n) {
		
		List<String> res = new LinkedList<String>();
		generator(res, "", n, n);
		return res;
		
    }
	
	private void generator(List<String> res, String s, int left, int right) {
        
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
		
	    if (left > 0)
            generator(res, s + "(", left - 1, right);
        
        
        if (right != 0 && right > left)
            generator(res, s + ")", left, right - 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
