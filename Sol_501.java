package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 501. Find Mode in Binary Search Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_501 {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	
	private ArrayList<Integer> res = new ArrayList<Integer>();
	private int maxCount = 0;
	private int currentCount = 1;
	private Integer currentVal = null;
	
	public int[] findMode(TreeNode root) {
		
		transpose(root);
		
		int i = 0;
		int[] ret = new int[res.size()];
		for (int j : res)
			ret[i++] = j;
		
		return ret;
		
    }
	
	private void transpose(TreeNode node) {
		
		if (node == null)
			return;
		
		transpose(node.left);
		
		handleVal(node);
		
		transpose(node.right);
		
	}
	
	private void handleVal(TreeNode node) {
		
		if (currentVal != null) {
			if (node.val == currentVal)
                currentCount++;        
            else
				currentCount = 1;
		}
		
		if (maxCount == currentCount) {
			res.add(node.val);
		} else if (maxCount < currentCount) {
			maxCount = currentCount;
			res.clear();
			res.add(node.val);
		}
        
        currentVal = node.val;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
