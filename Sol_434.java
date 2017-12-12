package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 434. Number of Segments in a String
 * 
 * @author czm
 * 
 *
 */
public class Sol_434 {
	
	public int countSegments(String s) {
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' '))
				count++;
		}
		
		return count;
    }
	
}
