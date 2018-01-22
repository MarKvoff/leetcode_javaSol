package leetcode_sol;

import org.w3c.dom.Node;

/**
 * This is the solution for problems in leetcode.com
 * Question 114. Flatten Binary Tree to Linked List
 * 
 * @author czm
 *
 */
public class Sol_114 {
	
	public void flatten(TreeNode root) {
		
		if (root == null)
			return;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = null;
		
		flatten(left);
		flatten(right);
		
		root.right = left;
		TreeNode cur = root;
		while (cur.right !=null)
			cur = cur.right;
		cur.right = right;
		
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
