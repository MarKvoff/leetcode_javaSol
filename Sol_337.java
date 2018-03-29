package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 337. House Robber III
 * 
 * @author czm
 * 
 *
 */
public class Sol_337 {
	
	public int rob(TreeNode root) {
        
        return Math.max(robTree(root, false), robTree(root, true));
        
    }
    
    
    public int robTree(TreeNode node, boolean parRobed) {
        
        if (node == null)
            return 0;
        
        if (parRobed)
            return robTree(node.left, false) + robTree(node.right, false);
        else {
            return Math.max(robTree(node.left, false) + robTree(node.right, false), node.val + robTree(node.left, true) + robTree(node.right, true));
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
