package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 459. Repeated Substring Pattern
 * 
 * @author czm
 * 
 *
 */
public class Sol_459 {
	
	public boolean repeatedSubstringPattern(String s) {
		
		if (s == null)
			return false;
		
		String str = s + s;
        str = str.substring(1, str.length()-1);
		
		return str.indexOf(s) != -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
