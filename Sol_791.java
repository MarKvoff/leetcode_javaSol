package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 791. Custom Sort String
 * 
 * @author czm
 * 
 *
 */
public class Sol_791 {
	
	public String customSortString(String S, String T) {
        
        boolean[] mapS = new boolean[26];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < S.length(); i++)
            mapS[S.charAt(i) - 'a'] = true;
        
        String res = "";
        
        
        for (int i = 0; i < T.length(); i++) {
            if (mapS[T.charAt(i) - 'a'])
                map.put(T.charAt(i), map.getOrDefault(T.charAt(i), 0) + 1);
            else
                res += T.charAt(i);
        }
        
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                int num = map.get(S.charAt(i));
                while (num > 0) {
                    res = res + S.charAt(i);
                    num--;
                }
            }
            
        }
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
