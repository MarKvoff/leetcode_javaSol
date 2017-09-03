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
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxProd = nums[0];
        int maxProdEndHere = nums[0];
        int minProdEndHere = nums[0];
        int maxProdhere = 0;
        int minProdhere = 0;
        
        for (int i = 0; i < nums.length; i++){
            maxProdhere = Math.max(Math.max(maxProdEndHere*nums[i],minProdEndHere*nums[i]),nums[i]);
            minProdhere = Math.min(Math.min(maxProdEndHere*nums[i],minProdEndHere*nums[i]),nums[i]);
            maxProdEndHere = maxProdhere;
            minProdEndHere = minProdhere;
            if (maxProdEndHere > maxProd)
                maxProd = maxProdEndHere;
        }
        return maxProd;
    }
}
