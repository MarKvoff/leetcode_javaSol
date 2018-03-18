package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 713. Subarray Product Less Than K
 * 
 * @author czm
 * 
 *
 */
public class Sol_713 {
	
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if (k == 0)
            return 0;
        
        int pro = 1;
        int cnt = 0;
        
        for (int i = 0, j = 0; j < nums.length; j++) {
            pro *= nums[j];
            
            while(i <= j && pro >= k) {
                pro /= nums[i];
                i++;
            }
            cnt += j - i + 1;
        }
        
        return cnt;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
