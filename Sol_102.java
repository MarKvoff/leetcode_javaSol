package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 102. Binary Tree Level Order Traversal
 * 
 * @author czm
 *
 */
public class Sol_102 {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while (!q.isEmpty()) {
			
			ArrayList<Integer> level = new ArrayList<Integer>();
			int size = q.size();
			while (size > 0) {
				TreeNode node = q.remove();
				level.add(node.val);
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
				size--;
			}
			res.add(level);
		}
		return res;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
