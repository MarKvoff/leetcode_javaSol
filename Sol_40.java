package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 39. Combination Sum
 * 
 * @author czm
 *
 */
public class Sol_40 {
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        backtrack(res, new LinkedList<Integer>(), 0, target, candidates, 0);
        return res;
        
    }
    
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int val, int target, int[] candidates, int start) {
        
        if (val == target) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
        	if (val + candidates[i] > target || (i > start && candidates[i] == candidates[i - 1]))
                continue;
            temp.add(candidates[i]);
            backtrack(list, temp, val + candidates[i], target, candidates, i + 1);
            temp.remove(temp.size() - 1);
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
