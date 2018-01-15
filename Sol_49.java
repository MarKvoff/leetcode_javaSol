package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 49. Group Anagrams
 * 
 * @author czm
 * 
 *
 */
public class Sol_49 {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String key = String.valueOf(chars);
			
			if (!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(str);
		}
		
		return new ArrayList<List<String>>(map.values());
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
