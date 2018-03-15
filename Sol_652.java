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
public class Sol_652 {
	
	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        List<TreeNode> res = new LinkedList<TreeNode>();
        tranverse(root, new HashMap<String, Integer>(), res);
        return res;
        
    }
    
    private String tranverse(TreeNode node, Map<String, Integer> map, List<TreeNode> res) {
        
        if (node == null)
            return "#";
        
        String line = node.val + "," + tranverse(node.left, map, res) + "," + tranverse(node.right, map, res);
        
        if (map.getOrDefault(line, 0) == 1)
            res.add(node);
        
        map.put(line, map.getOrDefault(line, 0) + 1);
        
        return line;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
