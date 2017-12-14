package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 438. Find All Anagrams in a String
 * 
 * @author czm
 * 
 *
 */
public class Sol_438 {
	
	public List<Integer> findAnagrams(String s, String p) {
		
		List<Integer> res = new ArrayList<Integer>();
		if (s == null || p == null || s.length() == 0 || p.length() == 0)
			return res;
		
		int[] map = new int[26];
		
		for (char c : p.toCharArray())
			map[c - 97]++;
		
		int left = 0, right = 0, count = p.length();
		
		while (right < s.length()) {
			
			if (map[s.charAt(right++) - 97]-- > 0)
				count--;
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'a';
		System.out.println(a);

	}

}
