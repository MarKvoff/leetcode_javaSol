package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 653. Two Sum IV - Input is a BST
 * 
 * @author czm
 * 
 *
 */
public class Sol_653 {
	
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> set = new HashSet<Integer>();
        return tranverse(root, set, k);
    }
	
	private boolean tranverse(TreeNode node, Set<Integer> set, int k) {
		
		if (node == null)
			return false;
		
		if (set.contains(k - node.val))
			return true;
		
		set.add(node.val);
		
		return tranverse(node.right, set, k) || tranverse(node.left, set, k);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
