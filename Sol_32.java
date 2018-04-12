package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 32. Longest Valid Parentheses
 * 
 * @author czm
 * 
 *
 */
public class Sol_32 {
	
	public int longestValidParentheses(String s) {
	    
        int[] dp = new int[s.length() + 1];
        int maxLen = 0;
        
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (!charStack.isEmpty() && charStack.peek() == '(' && s.charAt(i) == ')') {
                
                dp[i + 1] = dp[i] + dp[indexStack.peek() - 1] + 2;
                charStack.pop();
                indexStack.pop();
                maxLen = Math.max(maxLen, dp[i+1]);
            } else {
                charStack.push(s.charAt(i));
                indexStack.push(i + 1);
            }
        }
        
        return maxLen;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
