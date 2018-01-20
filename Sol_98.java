package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 98. Validate Binary Search Tree
 * 
 * @author czm
 *
 */
public class Sol_98 {
	
	public boolean isValidBST(TreeNode root) {
		
		if (root == null)
			return true;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pre = null;
		
		while (root != null || !stack.isEmpty()) {
			while(root != null) {
				stack.add(root);
				root = root.left;
			}
			root = stack.pop();
			if (pre != null && pre.val >= root.val)
				return false;
			pre = root;
			root = root.right;
		}
		
		return true;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
