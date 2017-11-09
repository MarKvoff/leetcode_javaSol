package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 110. Balanced Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_110 {
	
	//top to down method ==========================
	public boolean isBalanced(TreeNode root) {
		
		if (root == null)
			return true;
		
		int left = depth(root.left);
		int right = depth(root.right);
		
		if (Math.abs(left - right) <= 1)
			return isBalanced(root.left) && isBalanced(root.right);
		else
			return false;
        
    }
	
	public int depth(TreeNode node) {
		if (node == null)
			return 0;
		return Math.max(depth(node.left), depth(node.right)) + 1;	
	}
	
	
	//bottom to up method =============================================
	public boolean isBalancedV2(TreeNode root) {
		if(root==null){
	        return true;
	    }
		return dfsdep(root) != -1;
	}
	
	public int dfsdep(TreeNode node) {
		
		if (node == null)
			return 0;
		
		int left = dfsdep(node.left);
		if (left == -1) 
			return -1;
		
		int right = dfsdep(node.right);
		if (right == -1) 
			return -1;
		
		if (Math.abs(left - right) <= 1)
			return Math.max(left, right) + 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
