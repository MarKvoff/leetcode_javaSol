package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 654. Maximum Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_654 {
	
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return bulid(nums, 0, nums.length - 1);
        
    }
    
    private TreeNode bulid(int[] nums, int lo, int hi) {
        
        if (lo > hi)
            return null;
        
        int val = nums[lo], index = lo;
        for (int i = lo + 1; i <= hi; i++)
            if (val < nums[i]) {
                val = nums[i];
                index = i;
            }
        
        TreeNode node = new TreeNode(val);
        node.left = bulid(nums, lo, index - 1);
        node.right = bulid(nums, index + 1, hi);
        return node;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
