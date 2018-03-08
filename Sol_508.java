package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 508. Most Frequent Subtree Sum
 * 
 * @author czm
 * 
 *
 */
public class Sol_508 {
	HashMap<Integer, Integer> map;
    int max;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        
        map = new HashMap<Integer, Integer>();
        max = 0;
        
        sumCount(root);
        
        List<Integer> res = new LinkedList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                res.add(key);
            }
        }
        
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
        
    }
    
    
    private int sumCount(TreeNode node) {
        
        if (node == null)
            return 0;
        
        int sum = sumCount(node.left) + sumCount(node.right) + node.val;
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        max = Math.max(max, count);
        
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
