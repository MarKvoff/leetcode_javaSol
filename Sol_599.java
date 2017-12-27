package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 599. Minimum Index Sum of Two Lists
 * 
 * @author czm
 * 
 *
 */
public class Sol_599 {
	
	public String[] findRestaurant(String[] list1, String[] list2) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> strs = new ArrayList<String>();
		int minIndSum = Integer.MAX_VALUE;
		
		for (int i = 0; i < list1.length; i++)
			map.put(list1[i], i);
		
		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i]))
				if (i + map.get(list2[i]) < minIndSum) {
					strs.clear();
					strs.add(list2[i]);
					minIndSum = i + map.get(list2[i]);
				} else if (i + map.get(list2[i]) == minIndSum)
					strs.add(list2[i]);
		}
		
		return strs.toArray(new String[strs.size()]);
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
