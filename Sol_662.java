package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 652. Find Duplicate Subtrees
 * 
 * @author czm
 * 
 *
 */
public class Sol_662 {
	
	public int widthOfBinaryTree(TreeNode root) {
        
        return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
        
    }
    
    private int dfs(TreeNode node, int level, int index, List<Integer> left, List<Integer> right) {
        
        if (node == null)
            return 0;
        
        if (left.size() == level) {
            left.add(level, index);
            right.add(level, index);
        } else
            right.add(level, index);
        
        int cur = right.get(level) - left.get(level) + 1;
        
        int start = dfs(node.left, level + 1, index * 2, left, right);
        int end = dfs(node.right, level + 1, index * 2 + 1, left, right);
        return Math.max(cur, Math.max(start, end));
           
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
