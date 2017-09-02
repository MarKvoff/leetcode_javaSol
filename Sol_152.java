package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 152. Maximum Product Subarray
 * 
 * @author czm
 *
 */



public class Sol_152 {
	public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int maxEndHere = nums[0];
        for (int i = 1; i < nums.length; i++){
            maxEndHere = Math.max(nums[i], maxEndHere*nums[i]);
            maxProd = Math.max(maxProd, maxEndHere);
            
        }
        return maxProd;
        
    }
    
    
	
	
	
	
	

}
