package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 409. Longest Palindrome
 * 
 * @author czm
 * 
 *
 */
public class Sol_409 {
	
	public int longestPalindrome(String s) {
		
		int[] map = new int[58];
		int length = 0;
		boolean flag = false;
		
		for (int i = 0; i < s.length(); i++)
			map[s.charAt(i) - 65]++;
		
		for (int i = 0; i < 58; i++) {
			int t = map[i];
			while (t > 1) {
				length += 2;
				t -= 2;
			}
			if (!flag && t > 0) {
				length++;
				flag = !flag;
			}
		}
		
        return length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =  'A' - 'z';
		System.out.println(i);
		

	}

}
