package leetcode_sol;

import java.util.Arrays;

/**
 * This is the solution for problems in leetcode.com 
 * Question 455. Assign Cookies
 * 
 * @author czm
 * 
 *
 */
public class Sol_455 {
	
	public int findContentChildren(int[] g, int[] s) {
		
		int num = 0;
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		for (int i = 0, j = 0; i < g.length && j < s.length;j++) {
			
			if (s[j] >= g[i]) {
				i++;
				num++;
			}
		}
		return num;
        
    }

}
