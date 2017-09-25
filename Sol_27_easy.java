package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 27. Remove Element
 * 
 * @author czm
 * 
 *
 */
public class Sol_27_easy {
	
	public int removeElement(int[] nums, int val) {
        int lo = 0, hi = nums.length-1;
        
        while (lo <= hi){
            if (nums[lo] == val){
                nums[lo] = nums[hi--];
            }
            else
                lo++;
        }
        return lo;
    }

}
