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
	
	public int[] findFrequentTreeSum(TreeNode root) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        sumCount(map, root);
        
        int max = 0;
        for (int i: map.values())
        	max = Math.max(max, i);
        List<Integer> res = new LinkedList<>();
        for (int i : map.keySet())
        	if (max == map.get(i))
        		res.add(i);
        
        int[] a = new int[res.size()];
        a = res.toArray();
        return res;
        
        
        
    }
    
    
    private int sumCount(HashMap<Integer, Integer> map, TreeNode node) {
        
        if (node == null)
            return 0;
        
        int sum = sumCount(map, node.left) + sumCount(map, node.right) + node.val;
        map.put(map.get(sum), map.getOrDefault(sum, 0) + 1);
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
