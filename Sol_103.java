package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 103. Binary Tree Zigzag Level Order Traversal
 * 
 * @author czm
 *
 */
public class Sol_103 {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		
		List<List<Integer>> res = new ArrayList<>();
		preOrder(root, res, 0);
		return res;
    }
	
	private void preOrder(TreeNode node, List<List<Integer>> res, int level) {
		
		if (node == null)
			return;
		
		if (res.size() <= level) {
			LinkedList<Integer> array = new LinkedList<Integer>();
			res.add(array);
		}
		
		List<Integer> thisArray = res.get(level);
		if (level%2 == 0)
			thisArray.add(node.val);
		else
			thisArray.add(0, node.val);
		
		preOrder(node.left, res, level+1);
		preOrder(node.right, res, level+1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
