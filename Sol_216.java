package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 78. Subsets
 * 
 * @author czm
 *
 */
public class Sol_216 {
	
	public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        backtrack(res, new LinkedList<Integer>(), n, k, 1);
        return res;
        
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int n, int count, int start) {
        if (n < 0 || count < 0)
            return;
        
        if (count == 0 && n == 0) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            backtrack(list, temp, n - i, count - 1, i + 1);
            temp.remove(temp.size() - 1);
            
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
