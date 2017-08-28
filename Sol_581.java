/** 
* This is the solution for problems in leetcode.com  
* Question 581. Shortest Unsorted Continuous Subarray
*  
* @author czm 
* 
*/


public class Sol_581 {
	
	class Solution {
	    public int findUnsortedSubarray(int[] nums) {
	        if (nums.length == 1 || nums == null)
	            return 0;
	        
			int lo = 0;
			int hi = nums.length-1;
			while(nums[lo] <= nums[lo+1])
	            if (++lo == hi)
	                return 0;
			while(nums[hi-1] < nums[hi] && hi > lo)
				hi--;
			
			return hi - lo + 1;
			  
	    }
	}
	
	
	
	

}
