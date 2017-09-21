package leetcode_sol;

import java.util.*;
/**
 * This is the solution for problems in leetcode.com 
 * Question 442. Find All Duplicates in an Array
 * 
 * @author czm
 * 
 *
 */
public class Sol_442 {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        
        if (nums == null)
            return list;
        
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
            		list.add(index+1);
            nums[index] = -nums[index];
        }
                
        return list;
    }

}
