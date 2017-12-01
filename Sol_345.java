package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 345. Reverse Vowels of a String
 * 
 * @author czm
 * 
 *
 */
public class Sol_345 {
	
	public static String reverseVowels(String s) {
        
        String vowels = "aeiouAEIOU";
        
        int lo = 0, hi = s.length()-1;
		char[] revers = new char[s.length()];
		
		while (lo <= hi) {
			
			while (lo < hi && !vowels.contains(s.charAt(lo) + "")) {
				System.out.println("yes");
				revers[lo] = s.charAt(lo);
				lo++;
			}
			
			while (lo < hi && !vowels.contains(s.charAt(hi) + "")) {
				System.out.println("yes");
				revers[hi] = s.charAt(hi);
				hi--;
			}
			
			revers[lo] = s.charAt(hi);
			revers[hi--] = s.charAt(lo++);
			
		}
		
		
		return String.valueOf(revers);
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "m";
		//System.out.println(s.length());
		System.out.println(reverseVowels(s));

	}
	

}
