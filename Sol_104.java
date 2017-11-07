package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 104. Maximum Depth of Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_104 {
	
	public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
       
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
