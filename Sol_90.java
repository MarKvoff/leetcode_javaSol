package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 90. Subsets II
 * 
 * @author czm
 *
 */
public class Sol_90 {
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        backtrack(res, new LinkedList<Integer>(), nums, 0);
        return res;
        
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        
    	res.add(new ArrayList<Integer>(temp));
        
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
            
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
