package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 35. Search Insert Position
 * 
 * @author czm
 * 
 *
 */
public class Sol_35 {
	
public int searchInsert(int[] nums, int target) {
        
        int lo = 0, hi = nums.length-1;
        int mid = -1;
        
        while (lo <= hi) {
            mid = (lo + hi)/2;
            
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        
        return lo;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,4,6,7,11,13,16,20,24,27,30};
		
		
		

	}

}
