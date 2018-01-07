package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 680. Valid Palindrome II
 * 
 * @author czm
 * 
 *
 */

public class Sol_680 {
	
	public boolean validPalindrome(String s) {
		
		int l = -1, r = s.length();
		
		while (l++ < r--) {
			if (s.charAt(l) != s.charAt(r))
				return isPalindrome(s, l-1, r) || isPalindrome(s, l, r+1);
		}
		return true;
		
    }
	
	private boolean isPalindrome(String s, int l, int r) {
		while (l++ < r--)
			if (s.charAt(l) != s.charAt(r))
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
