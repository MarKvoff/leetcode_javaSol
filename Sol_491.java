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
        
        List<List<Integer>> res = new LinkedList<List<Integer>>();
		List<List<Integer>> holder = new LinkedList<List<Integer>>();
    
		if (nums.length < 2)
			return res;
    
		int end = 1;
		while (end < nums.length) {
        
			if (nums[end - 1] <= nums[end]) {
				if (!holder.isEmpty()) {
					for (List<Integer> piece : holder)
						piece.add(nums[end]);
                    List<Integer> str = new ArrayList<Integer>();
                    str.add(nums[end - 1]);
                    str.add(nums[end]);
                    holder.add(str);
                    
                } else {
					List<Integer> start = new ArrayList<Integer>();
					start.add(nums[end - 1]);
					start.add(nums[end]);
					holder.add(start);
				}
            	res.addAll(holder);
        	} else {
        		holder.clear();
        	}
            end++;
		}
        
        return res;
    }  
        
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
