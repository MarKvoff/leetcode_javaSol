package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 491. Increasing Subsequences
 * 
 * @author czm
 * 
 */
public class Sol_491 {
	
	public List<List<Integer>> findSubsequences(int[] nums) {
        
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        dfs(res, new LinkedList<Integer>(), nums, 0);
        List<List<Integer>> list = new ArrayList<>(res);
        return list;
        
    }
    
    private void dfs(Set<List<Integer>> res, List<Integer> tmp, int[] nums, int index) {
        
        if (tmp.size() > 1)
            res.add(new ArrayList<Integer>(tmp));
        
        for (int i = index; i < nums.length; i++) {
            if (tmp.isEmpty() || nums[i] >= tmp.get(tmp.size() - 1)) {
                tmp.add(nums[i]);
                dfs(res, tmp, nums, i + 1);
                tmp.remove(tmp.size() - 1);
            }
        }
        
    }  
        
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
