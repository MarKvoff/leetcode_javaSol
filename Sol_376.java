package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 376. Wiggle Subsequence
 * 
 * @author czm
 * 
 */
public class Sol_376 {
	
	public static int wiggleMaxLength(int[] nums) {
		
		if (nums.length < 2)
			return nums.length;
		
		int maxLen = 1;
		
		int sec = 1;
		while (sec < nums.length && nums[sec] == nums[0])
			sec++;
		
        boolean postIsIncreasing = true;
		if (sec < nums.length) {
            postIsIncreasing = nums[sec] - nums[0] > 0;
            maxLen++;
		}
		
		for (int i = sec + 1; i < nums.length; i++) {
			
			while (i < nums.length && nums[i - 1] == nums[i])
				i++;
			
			if (postIsIncreasing && nums[i - 1] > nums[i]) {
				maxLen++;
				postIsIncreasing = !postIsIncreasing;
				continue;
			}
			
			if (!postIsIncreasing && nums[i - 1] < nums[i]) {
				maxLen++;
				postIsIncreasing = !postIsIncreasing;
				continue;
			}
			
		}
		
		return maxLen;
		
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,0};
		Sol_376.wiggleMaxLength(nums);

	}

}
