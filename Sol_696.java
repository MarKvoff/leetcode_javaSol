package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 696. Count Binary Substrings
 * 
 * @author czm
 * 
 *
 */
public class Sol_696 {
	
	public int countBinarySubstrings(String s) {
		
		int prevLen = 0, nowLen = 1 , preVal = s.charAt(0), count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == preVal) {
				nowLen++;
				if (prevLen > 0) {
					prevLen--;
					count++;
				}
			} else {
				preVal = s.charAt(i);
				prevLen = nowLen;
				nowLen = 1;
				if (prevLen > 0) {
					prevLen--;
					count++;
				}
			}
		}
		return count;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
