package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 113. Path Sum II
 * 
 * @author czm
 *
 */
public class Sol_113 {
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		preOrder(root, 0, sum, new ArrayList<Integer>(), res);
		
        return res;
    }
	
	private void preOrder(TreeNode node, int nowSum, int sum, List<Integer> path, List<List<Integer>> res) {
		
		if (node == null)
			return;
		
		path.add(node.val);
		if (nowSum + node.val == sum && node.left == null && node.right == null)
			res.add(new ArrayList<Integer>(path));
		
		preOrder(node.left, nowSum + node.val, sum, path, res);
		preOrder(node.right, nowSum + node.val, sum, path, res);
		path.remove(path.size() - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
