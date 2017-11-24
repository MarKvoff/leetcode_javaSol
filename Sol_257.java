package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 257. Binary Tree Paths
 * 
 * @author czm
 * 
 *
 */
public class Sol_257 {

	public List<String> binaryTreePaths(TreeNode root) {
		
		List<String> path = new ArrayList<String>();
        if (root == null)
            return path;
        
		String pathToNow = root.val + "";
		
        printPath(root, pathToNow, path);
        
        return path;
    }
	
	public void printPath(TreeNode node, String pathToNow, List<String> path) {
		
		if (node.left == null && node.right == null) {
			path.add(pathToNow);
			return;
		}
		
		if (node.left != null) 
			printPath(node.left, pathToNow + "->" + node.left.val, path);
		if (node.right != null) 
			printPath(node.right, pathToNow + "->" + node.right.val, path);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


