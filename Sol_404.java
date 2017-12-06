package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 404. Sum of Left Leaves
 * 
 * @author czm
 * 
 *
 */
public class Sol_404 {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public int sumOfLeftLeaves(TreeNode root) {
		
		if (root == null)
			return 0;
		
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null)
				return root.left.val + sumOfLeftLeaves(root.right);
			return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
		}
		
		return sumOfLeftLeaves(root.right);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


