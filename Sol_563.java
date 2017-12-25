package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 563. Binary Tree Tilt
 * 
 * @author czm
 * 
 *
 */
public class Sol_563 {
	
	private int treeTilt = 0;
	
	public int findTilt(TreeNode root) {
		
		nodeTilt(root);
		return treeTilt;
        
    }
	
	
	private int nodeTilt(TreeNode node) {
		
		if (node == null)
			return 0;
		
		int TL = nodeTilt(node.left);
		int TR = nodeTilt(node.right);
		
		treeTilt += Math.abs(TL - TR);
		
		return TL + TR + node.val;
		
	}

}
