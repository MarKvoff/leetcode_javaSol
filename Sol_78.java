package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 78. Subsets
 * 
 * @author czm
 *
 */
public class Sol_78 {
	public List<List<Integer>> subsets(int[] nums) {
	     
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        backtrack(res, new ArrayList<Integer>(), nums, 0);
        return res;
        
    }
    
    
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int pos) {
        
        res.add(new ArrayList<Integer>(temp));
        
        for (int i = pos; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
