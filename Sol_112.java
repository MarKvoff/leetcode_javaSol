package leetcode_sol;

public class Sol_112 {
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		
		if (root.right == null && root.left == null && sum - root.val == 0)
				return true;
		
		boolean left = false;
		if (root.left != null)
			left =  hasPathSum(root.left, sum - root.val);
		boolean right = false;
		if (root.right != null)
			right =  hasPathSum(root.right, sum - root.val);
		
		return left || right;	
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
