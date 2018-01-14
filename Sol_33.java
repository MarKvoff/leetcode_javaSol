package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 33. Search in Rotated Sorted Array
 * 
 * @author czm
 *
 */
public class Sol_33 {
	
	public static int search(int[] nums, int target) {
		
		if (nums.length == 0)
            return -1;
        
		int lo = 0, hi = nums.length-1;
		int mid = (lo + hi)/2;
		
		while (lo < hi) {
			
			if (nums[mid] < nums[hi])
				hi = mid;
			else
				lo = mid +1 ;
			mid = (lo + hi)/2;
		}
		
		int minIndex = lo;
		
		lo = (target <= nums[nums.length - 1]) ? minIndex : 0;
		if (minIndex == 0)
			hi = nums.length - 1;
		hi = (target > nums[nums.length - 1]) ? minIndex  : nums.length - 1;

		while(lo <= hi) {
			mid = (lo + hi)/2;
			if (target > nums[mid])
				lo = mid + 1;
			else if (target < nums[mid])
				hi = mid - 1;
			else
				return mid;
			
		}
		
		return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1};
		
		Sol_33.search(a, 1);

	}
	

}
