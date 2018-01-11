package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 5. Longest Palindromic Substring
 * 
 * @author czm
 * 
 *
 */
public class Sol_5 {
	
private int maxLen = 0, start = 0;;
	
	public String longestPalindrome(String s) {
		
        int len = s.length();
	    if (len < 2)
	    	return s;
		
		for (int i = 0; i < s.length() - 1; i++) {
			extendPalindrome(s, i, i);
			extendPalindrome(s, i, i+1);
		}
		
		return s.substring(start, start + maxLen);
    }
	
	
	private void extendPalindrome(String s, int lo, int hi) {
		
		while (lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
			lo--;
			hi++;
		}
		
		if (maxLen < hi - lo - 1) {
			maxLen = hi - lo - 1;
			start = lo + 1;
		}
	}
	
	/*
	private void lenOfPalindrome(String s, int lo, int hi) {
		
		if (lo > hi)
			return;
		
		if (lo == hi) {
			if (maxLen < hi - lo + 1) {	
				maxLen = hi - lo + 1;
				start = lo;
			}
		}
		
		int st = lo, end = hi;
		while (st < end) {
			if (s.charAt(st) == s.charAt(end)) {
				st++;
				end--;
			} else {
				lenOfPalindrome(s, lo + 1, hi);
				lenOfPalindrome(s, lo, hi - 1);
				return;
			}
		}
		
		if (maxLen < hi - lo + 1) {	
			maxLen = hi - lo + 1;
			start = lo;
		}
		return;
	}
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "babad";
		
		Sol_5 a = new Sol_5();
		
		System.out.println(a.longestPalindrome(s));
		
	}

}

