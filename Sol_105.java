package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 105. Construct Binary Tree from Preorder and Inorder Traversal
 * 
 * @author czm
 * 
 *
 */
public class Sol_105 {
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		return build(preorder, inorder, 0, inorder.length - 1, 0);
		
    }
	
	private TreeNode build(int[] preorder, int[] inorder, int lo, int hi, int preStart) {
		
		if (lo > hi || preStart > preorder.length - 1)
			return null;
		
		int rootVal = preorder[preStart];
		TreeNode root = new TreeNode(rootVal);
		int index = -1;
		for (int i = lo; i <= hi; i++)
			if (inorder[i] == rootVal)
				index = i;
		
		root.left = build(preorder, inorder, lo, index - 1, preStart + 1);
		root.right = build(preorder, inorder, index + 1, hi, preStart  +index -lo +1 );
		return root;
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
