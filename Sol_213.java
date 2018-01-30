package leetcode_sol;

public class Sol_213 {
	
	public int rob(int[] nums) {
		
		if (nums.length == 1)
			return nums[0];
		return Math.max(robTheLine(nums, 0, nums.length - 2), robTheLine(nums, 1, nums.length - 1));
		
    }
	
	private int robTheLine(int[] nums, int lo, int hi) {
		 int robLast = 0, noRobLast = 0;
		 
		 for (int i = lo; i <= hi; i++) {
			 int tmp = robLast;
			 robLast = noRobLast + nums[i];
			 noRobLast = Math.max(tmp, noRobLast);
		 }
		
		 return Math.max(robLast, noRobLast);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
