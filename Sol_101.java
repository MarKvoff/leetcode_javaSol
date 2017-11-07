package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 101. Symmetric Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_101 {
	
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSameSymmTree(root.left, root.right);
		
    }
	
	public boolean isSameSymmTree(TreeNode p, TreeNode q) {
		
		if (p == null && q == null)
			return true;
		if (p == null || q == null) 
			return false; 
		
		if (p.val == q.val)
			return isSameSymmTree(p.left, q.right) && isSameSymmTree(p.right, q.left);
		return false; 
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

