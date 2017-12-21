package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 500. Keyboard Row
 * 
 * @author czm
 * 
 *
 */
public class Sol_500 {
	
	public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
		String[] strs = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		
		for (String str : strs)
			for (int i = 0; i < str.length(); i++)
				map.put(str.charAt(i), str.charAt(0) + 0);
		
		ArrayList<String> res = new ArrayList<String>();
		
        boolean flag = true;
		for (String word : words) {
			for (char c : word.toLowerCase().toCharArray())
				if (map.get(c) != map.get(word.toLowerCase().toCharArray()[0])){
                    flag = false;
                    break;
                }
            if (flag)
			    res.add(word);
            flag = true;
		}
		
		String[] ret = new String[res.size()];
		int i = 0;
		
		for (String s : res) {
			ret[i] = s;
			i++;
		}
		
		return ret;
        
    }

}
