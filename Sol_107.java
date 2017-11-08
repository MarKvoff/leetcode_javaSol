package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 107. Binary Tree Level Order Traversal II
 * 
 * @author czm
 * 
 *
 */
public class Sol_107 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		if (root == null)
			return null;
		
		Stack<List<Integer>> levelStack = new Stack<List<Integer>>();
		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		
		nodeQueue.add(root);
		while(!nodeQueue.isEmpty()) {
			int levelNum = nodeQueue.size();
			List levelElms = new ArrayList<Integer>();
			for (int i = 1; i <= levelNum; i++) {
				TreeNode node = nodeQueue.poll();
				levelElms.add(node.val);
				if (node.left != null)
					nodeQueue.add(node.left);
				if (node.right != null)
					nodeQueue.add(node.right);
			}
			levelStack.add(levelElms);
		}
		List list = new ArrayList<List<Integer>>();
		while(!levelStack.isEmpty())
			list.add(levelStack.pop());
		
		return list;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
