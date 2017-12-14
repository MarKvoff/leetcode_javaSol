package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 437. Path Sum III
 * 
 * @author czm
 * 
 *
 */
public class Sol_437 {
	
	public int pathSum(TreeNode root, int sum) {
		
		if (root == null)
			return 0;
		
		return pathSum(root.left, sum) + pathSum(root.right, sum) + pathSumHelp(root, sum);
		
    }
	
	
	public int pathSumHelp(TreeNode node, int sum) {
		
		if (node == null)
			return 0;
		
		int i = 0;
		if (sum == node.val)
			i = 1;
		return i + pathSumHelp(node.left, sum - node.val) + pathSumHelp(node.right, sum - node.val);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
