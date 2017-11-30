package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 290. Word Pattern
 * 
 * @author czm
 * 
 *
 */
public class Sol_290 {
	
	public boolean wordPattern(String pattern, String str) {
		
		String[] strs = str.split(" ");
		
		if (pattern.length() != strs.length)
				return false;	
			
		Map map = new HashMap();
		for (int i = 0; i < strs.length; i++) {
			if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(strs[i], i)) )
				return false;
		}

		return true;
		
	}

}
