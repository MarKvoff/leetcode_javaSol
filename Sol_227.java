package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 227. Basic Calculator II
 * 
 * @author czm
 * 
 *
 */
public class Sol_227 {
	
	public int calculate(String s) {
		
		s.trim();
		Stack<Integer> ops = new Stack<Integer>();
		int num = 0;
		char op = '+';
		
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i)))
				num = num*10 + s.charAt(i) - '0';
			
			if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1) {
				if (op == '+')
					ops.push(num);
				if (op == '-')
					ops.push(0-num);
				if (op == '/') {
					int tmp = ops.pop();
					ops.push(tmp/num);
				}
				if (op == '*') {
					int tmp = ops.pop();
					ops.push(tmp*num);
				}
				num = 0;
				op = s.charAt(i);
			}
			
		}
		
		int res = 0;
		
		for (int i : ops)
			res += i;
		
		return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
