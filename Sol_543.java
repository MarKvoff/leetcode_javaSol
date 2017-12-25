package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 543. Diameter of Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_543 {
	
	private int maxLen = 0;
	
	public int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		return maxLen;
    }
	
	
	private int maxDepth(TreeNode node) {
		
		if (node == null)
			return 0;
		
		int depL = maxDepth(node.left);
		int depR = maxDepth(node.right);
		
		maxLen = Math.max(maxLen, depL + depR);
		
		return Math.max(depL, depR) + 1;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
