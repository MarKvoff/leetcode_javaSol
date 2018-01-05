package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 669. Trim a Binary Search Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_669 {
	
	public TreeNode trimBST(TreeNode root, int L, int R) {
		
		TreeNode newRoot = findRoot(root, L, R);
		
		tranverse(newRoot, L, R);
		
        return newRoot;
    }
	
	private TreeNode findRoot(TreeNode root, int L , int R) {
		
		if (root == null || (root.val >= L && root.val <= R))
			return root;
		
		else if (root.val < L)
			return findRoot(root.right, L, R);
		
		else
			return findRoot(root.left, L, R);
		
	}
	
	private void tranverse(TreeNode node, int L, int R) {
		
		if (node == null)
			return;
		
		if (node.left != null && node.left.val < L) {
			node.left = node.left.right;
            tranverse(node, L, R);
        }
		
		if (node.right != null && node.right.val > R) {
			node.right = node.right.left;
            tranverse(node, L, R);
        }
            
		tranverse(node.left, L, R);
		tranverse(node.right, L, R);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
