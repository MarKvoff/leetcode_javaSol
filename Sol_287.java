package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 287. Find the Duplicate Number
 * 
 * @author czm
 *
 */


public class Sol_287 {
	
	
	//but this is a bad version
	public static int findDuplicate(int[] nums) {
		
		int target = nums[0];
		int lo = 0;
		int hi = nums.length-1;
		
		while(true) {
			//use same principle as binary research, every while loop will check one element
			//the search will stop after O(log N) times
			
			int lessThan = 0;
			int moreThan = 0;
			int equal = 0;
			
			System.out.println("enter while");
			for (int i = 0; i < nums.length; i++) {
				
				if (target == nums[i])
					equal++;
				else if (target > nums[i])
					lessThan++;
				else
					moreThan++;
				
				if (equal > 1)
					return target;
		
				if (lessThan > target-1) {
					System.out.println("enter less field");
					hi = target - 1;
					target = (lo+target)/2;
					break;
				}
				
				if (moreThan > nums.length-target-1) {
					System.out.println("enter more field");
					lo = target + 1;
					target = (1 + target+hi)/2;
					break;
					
				}
				System.out.println("target is: " + target + " equal is: " + equal + " moreThan is " + moreThan);
				System.out.println("lo is: " + lo + ", hi is: " + hi);

			}
			
		}
    }
	
	public static void main(String[] args) {
		int[] a = {2,1,3,4,3};
		System.out.println(Sol_287.findDuplicate(a));
		
	}
	
}
