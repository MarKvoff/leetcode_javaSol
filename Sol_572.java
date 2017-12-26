package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 572. Subtree of Another Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_572 {
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
		
		if (s == null)
			return false;
		
		if (isSameTree(s, t))
			return true;
		
		return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
	
	private boolean isSameTree(TreeNode s, TreeNode t) {
		
		
		if (s == null && t == null)
			return true;
		
		if (s == null || t == null)
			return false;
		
		
		if (s.val != t.val)
			return false;
			
		return isSameTree(s.left, t.left) && isSameTree(s.right,t.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
