package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 784. Letter Case Permutation
 * 
 * @author czm
 * 
 *
 */
public class Sol_784 {
	public List<String> letterCasePermutation(String S) {
        
        List<String> res = new LinkedList<>();
        res.add("");
        return help(S, 0, res);
        
    }
    
    private List<String> help(String S, int pos, List<String> res) {
        
        if (S == null || S.length() == pos)
            return res;
        
        if (S.charAt(pos) >= '0' && S.charAt(pos) <= '9') {
            List<String> newRes = new LinkedList<String>();
            for (String s : res)
                newRes.add(s + S.charAt(pos));
            return help(S, pos + 1, newRes);
        } else {
            List<String> newRes = new LinkedList<String>();
                for (String s : res) {
                    newRes.add(s + Character.toUpperCase(S.charAt(pos)));
                    newRes.add(s + Character.toLowerCase(S.charAt(pos)));
                }
            return help(S, pos + 1, newRes);
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
