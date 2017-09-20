
/**
 * This is the solution for problems in leetcode.com 
 * Question 120. Triangle
 * 
 * @author czm
 *
 */
public class Sol_153 {
	
	public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length-1])
            return nums[0];

        int lo = 0, hi = nums.length-1;
        int mid = (lo+hi)/2;
        
        while (lo < hi-1){
            if (nums[mid] < nums[lo])
                hi = mid;
            else
                lo = mid;
            mid = (lo+hi)/2;
        }
        return nums[hi];
    }

}
