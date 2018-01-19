package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 95. Unique Binary Search Trees II
 * 
 * @author czm
 *
 */
public class Sol_95 {
	
	public List<TreeNode> generateTrees(int n) {
		
		List<TreeNode>[] result = new ArrayList[n + 1];
		result[0] = new ArrayList<TreeNode>();
		
		if (n == 0)
			return result[0];
		
		result[0].add(null);
		
		for (int i = 1; i <= n; i++) {
			result[i] = new ArrayList<TreeNode>();
			for (int j = 1; j <= i; j++) {
				for (TreeNode lNode : result[j - 1]) {
					for (TreeNode rNode : result[i - j]) {
						TreeNode root = new TreeNode(j);
						root.left = lNode;
						root.right = clone(rNode, j);
						result[i].add(root);
					}
				}
			}
		}

		return result[n];
    }
	
	private TreeNode clone(TreeNode root, int offset) {
		
		if (root == null)
			return null;
		
		TreeNode newRoot = new TreeNode(root.val + offset);
		newRoot.left = clone(root.left, offset);
		newRoot.right = clone(root.right, offset);
		
		return newRoot;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
