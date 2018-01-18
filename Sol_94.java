package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 94. Binary Tree Inorder Traversal
 * 
 * @author czm
 * 
 *
 */
public class Sol_94 {
	
	//iteratively
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pos = root;
		
		while (pos != null || !stack.isEmpty()) {
			while (pos != null) {
				stack.push(pos);
				pos = pos.left;
			}
			pos = stack.pop();
			result.add(pos.val);
			pos = pos.right;
		}
		
		return result;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
