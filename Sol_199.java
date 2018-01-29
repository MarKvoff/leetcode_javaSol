package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 199. Binary Tree Right Side View
 * 
 * @author czm
 * 
 *
 */
public class Sol_199 {
	
	public List<Integer> rightSideView(TreeNode root) {
		
		List<Integer> res = new LinkedList<Integer>();
		preOrder(root, res, 0);
		return res;
		
    }
	
	private void preOrder(TreeNode node, List<Integer> res, int depth) {
		if (node == null)
			return;
		
		if (depth == res.size())
			res.add(node.val);
		
		preOrder(node.right, res, depth+1);
		preOrder(node.left, res, depth+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
