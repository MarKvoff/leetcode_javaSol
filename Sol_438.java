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
		
		int[] hit = new int[26];
		
		for (char i : p.toCharArray()) 
			hit[i - 97]++;
		
		List<Integer> res = new ArrayList<Integer>();
		if (s == null || s.length() == 0 || p == null || p.length() == 0) 
			return res;
		int front = 0, end = 0, count = p.length();
		
		while (end < s.length()) {
			
			if (--hit[s.charAt(end++) - 97] >= 0)
				count--;
			
			if (count == 0)
				res.add(front);
			
			if ((end - front) == p.length() && ++hit[s.charAt(front++) - 97] > 0)
				count++;
		}
		
		return res;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 'a';
		System.out.println(x);

	}

}
