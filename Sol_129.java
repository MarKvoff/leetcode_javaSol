package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 129. Sum Root to Leaf Numbers
 * 
 * @author czm
 *
 */
public class Sol_129 {
	
	private int sum = 0;
	
	public int sumNumbers(TreeNode root) {
		preOrder(root, "");
        return sum;
    }
	
	private void preOrder(TreeNode node, String number) {
		
		if (node == null)
			return;
		
		
		String newNumber = number + node.val;
		if (node.left == null && node.right == null)	
			sum += Integer.valueOf(newNumber);
		
		preOrder(node.left, newNumber);
		preOrder(node.right, newNumber);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
