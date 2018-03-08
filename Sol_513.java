package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 513. Find Bottom Left Tree Value
 * 
 * @author czm
 * 
 *
 */
public class Sol_513 {
	
	int maxLevel;
	int val;
	
	public int findBottomLeftValue(TreeNode root) {
		
		maxLevel = 0;
		tranverse(root, 1);
		
        return val;
    }
	
	private void tranverse(TreeNode node, int level) {
		
		if (node == null)
			return;
		
		if (maxLevel < level) {
			maxLevel = level;
			val = node.val;
		}
		
		if (node.left != null)
			tranverse(node.left, level + 1);
		
		if (node.right != null)
			tranverse(node.right, level + 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
