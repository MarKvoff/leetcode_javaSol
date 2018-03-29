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
	
	//dfs solution;
	public int rob(TreeNode root) {
        
        int[] top = robTree(root);
        return Math.max(top[0], top[1]);
        
    }
    
    
    public int[] robTree(TreeNode node) {
    
        if(node == null)
            return new int[2];
        
        int[] left = robTree(node.left);
        int[] right = robTree(node.right);
        //index 1 for robbed, 0 for sikpped
        int[] now = new int[2];
        
        now[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        now[1] = node.val + left[0] + right[0];
        return now;
        
    }
	
	
	
	
	/* not dfs solution
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
    
    */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
