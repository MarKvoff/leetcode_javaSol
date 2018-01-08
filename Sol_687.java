package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 687. Longest Univalue Path
 * 
 * @author czm
 * 
 *
 */
public class Sol_687 {
	
	private int maxPath = 0;
	
	public int longestUnivaluePath(TreeNode root) {
		
		if (root == null)
			return 0;
		
		tranverse(root, root.val);
		return maxPath;
        
    }
	
	private int tranverse(TreeNode node, int lastNodeVal) {
		
		if (node == null)
			return 0;
		
		int left = tranverse(node.left, node.val);
		int right = tranverse(node.right, node.val);
		
		maxPath = Math.max(maxPath, left + right);
		
		if (node.val == lastNodeVal)
			return 1 + Math.max(left, right);
		
		return 0;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
