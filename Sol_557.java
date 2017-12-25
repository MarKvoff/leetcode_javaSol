package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 543. Diameter of Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_557 {
	
	public String reverseWords(String s) {
		
		String[] strs = s.split(" ");
		int i = 0;
		for (String str : strs)
			strs[i++] = new StringBuilder(str).reverse().toString();
		
		StringBuilder res = new StringBuilder();
		for (String str : strs)
			res.append(str + " ");
		
		return res.toString().trim();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
