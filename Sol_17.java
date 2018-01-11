package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 17. Letter Combinations of a Phone Number
 * 
 * @author czm
 * 
 *
 */
public class Sol_17 {
	
	public List<String> letterCombinations(String digits) {
		
		LinkedList<String> q = new LinkedList<String>();
		if (digits.length() == 0)
            return q;
		String[] mapping = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		q.add("");
		
		for (int i = 0; i < digits.length(); i++) {
			int index = Character.getNumericValue(digits.charAt(i));
			while (q.peek().length() == i) {
				String peek = q.remove();
				for (int j = 0; j < mapping[index].length(); j++ ) {
					q.add(peek + mapping[index].charAt(j));
				}
			}
		}
		
		return q;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a = new StringBuilder("asd");
		a.append("s");
		
		System.out.println(a);
		
	}
	
}

