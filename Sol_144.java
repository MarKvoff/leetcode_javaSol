package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 144. Binary Tree Preorder Traversal
 * 
 * @author czm
 *
 */
public class Sol_144 {
	
	public List<Integer> preorderTraversal(TreeNode root) {
		
		List<Integer> res = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pos = root;
		
		while (pos != null || !stack.isEmpty()) {
			
			while (pos != null) {
				res.add(pos.val);
				stack.add(pos.right);
				pos = pos.left;
			}
			
			pos = stack.pop();
		}
		
		return res;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
