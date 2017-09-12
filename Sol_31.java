package leetcode_sol;


import java.util.*;
/**
 * This is the solution for problems in leetcode.com
 * Question 31. Next Permutation
 *
 * 
 * @author czm
 * 
 *
 */
public class Sol_31 {
	
	public void nextPermutation(int[] nums) {
        int index = nums.length-1;
        
        while(index > 0 && nums[index-1] >= nums[index])
            index--;
        
        if (index == 0) {
            Arrays.sort(nums);
            return;
        }
        
        int minIntBiggerThanIndex = Integer.MAX_VALUE, minIndex = 0;
        for (int i = index; i < nums.length; i++) {
        		if (nums[i] > nums[index-1])
        			if (nums[i] < minIntBiggerThanIndex) {
        				minIntBiggerThanIndex = nums[i];
        				minIndex = i;
        			}
        }
        
        int tmp = nums[index-1];
        nums[index-1] = minIntBiggerThanIndex;
        nums[minIndex] = tmp;
        
        Arrays.sort(nums, index, nums.length);
    }

}
