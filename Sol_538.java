package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 538. Convert BST to Greater Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_538 {
	
	private int sum = 0;
	
	public TreeNode convertBST(TreeNode root) {
		
		tranverse(root);
		return root;
    }
	
	private void tranverse(TreeNode node) {
		
		if (node == null)
			return;
		
		tranverse(node.right);
		
		int tmp = node.val;
		node.val += sum;
		sum += tmp;
		
		tranverse(node.left);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
