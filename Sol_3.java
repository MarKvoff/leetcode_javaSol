package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 3. Longest Substring Without Repeating Characters
 * 
 * @author czm
 * 
 *
 */
public class Sol_3 {
	
	public int lengthOfLongestSubstring(String s) {
		
		if (s.length() == 0)
            return 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int pos = 0, lo = 0;
		int maxLen =0;
		
		while (pos < s.length()) {
			if (map.containsKey(s.charAt(pos))) {
				
				
			}
			map.put(s.charAt(pos), pos);
			maxLen = Math.max(maxLen, pos - lo +1);
			pos++;
		}
		
		return maxLen;   
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
