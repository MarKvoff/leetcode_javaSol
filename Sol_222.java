package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 222. Count Complete Tree Nodes
 * 
 * @author czm
 *
 */
public class Sol_222 {
	
	public int countNodes(TreeNode root) {
		
		if (root == null)
			return 0;
		
		int leftHight = leftHight(root);
		int rightHight = rightHight(root);
		
		if (leftHight == rightHight)
			return (1 << leftHight) -1;
		else
			return 1 + countNodes(root.left) + countNodes(root.right);
		
    }
	
	private int leftHight(TreeNode node) {
		
		if (node == null)
			return 0;
		
		return leftHight(node.left) + 1;
		
	}
	
	private int rightHight(TreeNode node) {
		
		if (node == null)
			return 0;
		
		return rightHight(node.right) + 1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
