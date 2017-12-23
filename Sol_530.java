package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 530. Minimum Absolute Difference in BST
 * 
 * @author czm
 * 
 *
 */
public class Sol_530 {
	
	private Integer prev = null;
	private int currentAbs = Integer.MAX_VALUE;
	private int minAbs = Integer.MAX_VALUE;
	
	public int getMinimumDifference(TreeNode root) {
		
		transvers(root);
		return minAbs;
    }			
	
	public void transvers(TreeNode node) {
		
		if (node == null)
			return;
		
		transvers(node.left);
		
		if (prev != null) {
			currentAbs = Math.abs(prev - node.val);
			minAbs = Math.min(minAbs, currentAbs);
		}
		
		prev = node.val;
		
		transvers(node.right);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
