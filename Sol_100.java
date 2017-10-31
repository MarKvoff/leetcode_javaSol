package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 100. Same Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_100 {
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) { val = x; }
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		
		if (p == null && q == null)
			return true;
		if (p == null || q == null) 
			return false; 
		
		if (p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false; 
    }
	
	public static void main(String[] args) {
		Sol_100 so = new Sol_100();
		TreeNode a = null;
		TreeNode b = so.new TreeNode(1);
		
		if (Sol_100.isSameTree(a,b))
			System.out.println("true");
		else 
			System.out.println("false");
		
		
		
	}

}
