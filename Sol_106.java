package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 106. Construct Binary Tree from Inorder and Postorder Traversal
 * 
 * @author czm
 * 
 *
 */
public class Sol_106 {
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		
		return build(postorder, inorder, 0, inorder.length - 1, postorder.length - 1);
        
    }
	
private TreeNode build(int[] postorder, int[] inorder, int start, int end, int poStart) {
		
		if (start > end || poStart < 0)
			return null;
		
		int rootVal = postorder[poStart];
		TreeNode root = new TreeNode(rootVal);
		int index = -1;
		for (int i = start; i <= end; i++)
			if (inorder[i] == rootVal)
				index = i;
		
		root.left = build(postorder, inorder, start, index - 1, poStart - end + index -1);
		root.right = build(postorder, inorder, index + 1, end, poStart - 1);
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
