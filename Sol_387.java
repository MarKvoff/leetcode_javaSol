package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 387. First Unique Character in a String
 * 
 * @author czm
 * 
 *
 */
public class Sol_387 {
	
	public int firstUniqChar(String s) {
        int[] map = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			if (map[s.charAt(i)-97] == 0)
				map[s.charAt(i)-97] = i+1;
			else
				map[s.charAt(i)-97] = -1;
		}
		
		int result = Integer.MAX_VALUE;
		for (int i : map)
			if (i > 0)
				result = Math.min(result, i-1);
		return result == Integer.MAX_VALUE ? -1: result;
        
    }

}
