package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 242. Valid Anagram
 * 
 * @author czm
 * 
 *
 */
public class Sol_242 {
	
	public boolean isAnagram(String s, String t) {
        
		//HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int[] bitmap = new int[26];
		
		for (int i = 0; i < s.length(); i++)
			bitmap[s.charAt(i)-97]++;
		for (int i = 0; i < t.length(); i++)
			bitmap[t.charAt(i)-97]--;
		for (int i = 0; i < 26; i++)
			if (bitmap[i] != 0)
				return false;
		
		
		return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 'a';
		System.out.println(a);

	}

}
