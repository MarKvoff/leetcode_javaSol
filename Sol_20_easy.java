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
	
	public static boolean isValid(String s) {
		
        Stack<Character> Parentheses = new Stack<>();
        char[] str = s.toCharArray();
        System.out.println(str);
        for (char c : str) {
        		System.out.println(c);
        		if (c == '(' || c == '[' || c == '{')
        			Parentheses.push(c);
        		
        		if (c == ')')
        			if (Parentheses.isEmpty() || Parentheses.pop() != '(')
        				return false;
        		if (c == ']')
        			if (Parentheses.isEmpty() || Parentheses.pop() != '[')
        				return false;
        		if (c == '}')
        			if (Parentheses.isEmpty() || Parentheses.pop() != '{')
        				return false;
        	
        }
        if (Parentheses.isEmpty())
        		return true;
        else
        		return false;
        
    }
	
	public static void main(String[] args) {
		Sol_20_easy.isValid("()");
	}

}
