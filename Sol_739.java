package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 739. Daily Temperatures
 * 
 * @author czm
 * 
 *
 */
public class Sol_739 {
	
public int[] dailyTemperatures(int[] temperatures) {
        
        int days = temperatures.length;
        int[] res = new int[days];
        
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < days; i++) {
            
            while(!stack.isEmpty() && stack.peek() < temperatures[i]) {
                List<Integer> indexs = map.get(stack.pop());
                for (int index : indexs)
                    res[index] = i - index;
                indexs.clear();
            }
            stack.push(temperatures[i]);
            if (map.containsKey(temperatures[i])) {
                List<Integer> indexs = map.get(temperatures[i]);
                indexs.add(i);
            } else {
                List<Integer> indexs = new LinkedList<>();
                indexs.add(i);
                map.put(temperatures[i], indexs);
            }
            
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
