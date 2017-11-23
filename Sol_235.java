package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 235. Lowest Common Ancestor of a Binary Search Tree 
 * 
 * @author czm
 * 
 *
 */
public class Sol_235 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if (root == null)
			return null;
		
		if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);
		else if (root.val < p.val && root.val < q.val)
			return lowestCommonAncestor(root.right, p, q);
		else
			return root;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
