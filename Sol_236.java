package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 236. Lowest Common Ancestor of a Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_236 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null || root == p || root == q)
            return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null)
            return root;
        
        return left != null ? left : right;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
