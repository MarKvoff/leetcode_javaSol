package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 47. Permutations II
 * 
 * @author czm
 * 
 *
 */
public class Sol_47 {
	
	public List<List<Integer>> permuteUnique(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        backtrack(res, new LinkedList<Integer>(), nums, new boolean[nums.length], 0);
        return res;
        
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] pick, int len) {
        
        if (len == nums.length) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (pick[i] || (i > 0 && nums[i] == nums[i - 1] && !pick[i-1]))
                continue;
            pick[i] = true;
            temp.add(nums[i]);
            backtrack(list, temp, nums, pick, len + 1);
            temp.remove(temp.size() - 1);
            pick[i] = false;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
