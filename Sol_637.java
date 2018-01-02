package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 637. Average of Levels in Binary Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_637 {
	
	public List<Double> averageOfLevels(TreeNode root) {
		
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		List<Double> result = new ArrayList<Double>();
		
		if (root == null)
			return result;
		
		q1.add(root);
		
		while(!q1.isEmpty()) {
			
			double mean = 0;
			int levelNum = q1.size();

			for (TreeNode t : q1)
				mean += t.val;
			mean /= (double)levelNum;
			result.add(mean);
			
			while (levelNum > 0) {
				TreeNode n = q1.poll();
				if (n.left != null)
					q1.add(n.left);
				if (n.right != null)
					q1.add(n.right);
				levelNum--;
			}
		}
		
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
