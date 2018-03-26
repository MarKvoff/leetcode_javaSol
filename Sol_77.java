package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 77. Combinations
 * 
 * @author czm
 * 
 *
 */
public class Sol_77 {
	
	public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        backtrack(res, new LinkedList<Integer>(), n, 0, k);
        return res;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int n, int val, int k) {
        
        if (k == 0) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int i = val + 1; i <= n; i++) {
            
            temp.add(i);
            backtrack(list, temp, n, i, k - 1);
            temp.remove(temp.size() - 1);
            
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
