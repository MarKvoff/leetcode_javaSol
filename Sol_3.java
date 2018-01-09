package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 3. Longest Substring Without Repeating Characters 
 * 
 * @author czm
 *
 */
public class Sol_3 {
	
	public static int lengthOfLongestSubstring(String s) {
		
		if (s.length() == 0)
			return 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int lo = 0, pos = 0;
		int maxLen = 0;
		
		while (pos < s.length()) {
			
			if (map.containsKey(s.charAt(pos)))
				lo = Math.max(map.get(s.charAt(pos)) + 1, lo);
				
			map.put(s.charAt(pos), pos);
			maxLen = Math.max(maxLen, pos - lo + 1);
			System.out.println("lo is: " + lo + ", pos is: " + pos );
			pos++;
			
			
		}
		
		return maxLen;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abba";
		
		System.out.println(Sol_3.lengthOfLongestSubstring(a));

	}

}
