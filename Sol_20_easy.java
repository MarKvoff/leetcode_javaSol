package leetcode_sol;

import java.util.*;
/**
 * This is the solution for problems in leetcode.com 
 * Question 20. Valid Parentheses
 * 
 * @author czm
 * 
 *
 */
public class Sol_20_easy {
	
	public boolean isValid(String s) {
		
        Stack<Character> Parentheses = new Stack<>();
        char[] str = s.toCharArray();
        for (char c : str) {
        		if (c == '(' || c == '[' || c == '{')
        			Parentheses.push(c);
        		if (c == '}' || c == '}' || c == '}')
        			if (Parentheses.pop() != c)
        				return false;
        	
        }
        
        return true;
        
        
    }

}
