package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 230. Kth Smallest Element in a BST
 * 
 * @author czm
 * 
 *
 */
public class Sol_230 {
	
	public int kthSmallest(TreeNode root, int k) {
		
		int count = countTheNode(root.left);
		
		if (count + 1 == k)
			return root.val;
		else if (count + 1 < k)
			return kthSmallest(root.right, k - count - 1);
		else
			return kthSmallest(root.left, k);
        
    }
	
	private int countTheNode(TreeNode node) {
		
		if (node == null)
			return 0;
		
		return 1 + countTheNode(node.left) + countTheNode(node.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
