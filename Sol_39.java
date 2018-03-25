package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 39. Combination Sum
 * 
 * @author czm
 *
 */
public class Sol_39 {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        //Arrays.sort(candidates);
        List<List<Integer>> res = new LinkedList<>();
        backtrack(res, new ArrayList<Integer>(), 0, target, candidates);
        return res;
        
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int val, int target, int[] candidates) {
        
        if (val == target) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int i : candidates) {
        	if (val + i > target || (!temp.isEmpty() && i < temp.get(temp.size() - 1)))
                continue;
            temp.add(i);
            backtrack(list, temp, val + i, target, candidates);
            temp.remove(temp.size() - 1);
        }
        
    }
	

}
