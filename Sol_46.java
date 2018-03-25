package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 46. Permutations
 * 
 * @author czm
 *
 */
public class Sol_46 {
	
	public List<List<Integer>> permute(int[] nums) {
		
		List<List<Integer>> res = new LinkedList<>();
        backtrack(res, new ArrayList<Integer>(), nums);
        return res;
        
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        
        if (temp.size() == nums.length)
        	list.add(new ArrayList<Integer>(temp));
        
        for (int i = 0; i < nums.length; i++) {
        	if (temp.contains(nums[i]))
        		continue;
        	temp.add(nums[i]);
        	backtrack(list, temp, nums);
        	temp.remove(temp.size() - 1);
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
