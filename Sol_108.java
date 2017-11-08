package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 108. Convert Sorted Array to Binary Search Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_108 {
	
	public TreeNode sortedArrayToBST(int[] nums) {
		
		if (nums == null)
			return null;
		
		int lo = 0, hi = nums.length-1;
		
		TreeNode root = helper(nums, lo, hi);
		return root;   
    }
	
	public TreeNode helper(int[] nums, int lo, int hi) {
		if (lo > hi)
			return null;
		
		int mid = (lo + hi)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, lo, mid-1);
		node.right = helper(nums, mid+1, hi);
		
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
