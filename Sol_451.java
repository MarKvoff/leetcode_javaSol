package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 450. Delete Node in a BST
 * 
 * @author czm
 * 
 */
public class Sol_451 {
	
	public String frequencySort(String s) {
		
		int volum = s.length();
        if (volum <= 1)
            return s;
        
        String[] res = new String[volum + 1];
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < volum; i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);
        }
        
        for (Character c : map.keySet()) {
            if (res[map.get(c)] == null)
                res[map.get(c)] = c + "";
            else
                res[map.get(c)] += c;
        }
        
        String out = "";
        
        for (int i = volum; i > 0 ; i--) {
            if (res[i] != null)
                for (int j = 0; j < res[i].length(); j++)
                    for (int count = i; count > 0; count--)
                        out = out + res[i].charAt(j);
            
            
        }
        return out;
		
		
		
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
