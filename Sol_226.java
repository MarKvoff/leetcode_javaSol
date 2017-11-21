package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 226. Invert Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_226 {
	
	public TreeNode invertTree(TreeNode root) {
		
		if (root == null)
			return null;
		
		if (!(root.left == null && root.right == null)) {
			
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			
			if (root.right != null)
				root.right = invertTree(root.right);
			
			if (root.left != null)
				root.left = invertTree(root.left);
		}
		
		return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
