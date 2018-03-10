package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 515. Find Largest Value in Each Tree Row
 * 
 * @author czm
 * 
 *
 */
public class Sol_515 {
	
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public List<Integer> largestValues(TreeNode root) {
    	
    		map = new HashMap<Integer, Integer>();
        
        tranverse(root, 0);
        
        List<Integer> res = new ArrayList<>(map.values());
        return res;
        
    }
    
    private void tranverse(TreeNode node, int level) {
        
        if (node == null)
            return;
        
        map.put(level, Math.max(map.getOrDefault(level, Integer.MIN_VALUE), node.val));
        tranverse(node.left, level + 1);
        tranverse(node.right, level + 1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
