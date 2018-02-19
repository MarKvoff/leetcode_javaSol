package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 347. Top K Frequent Elements
 * 
 * @author czm
 * 
 */
public class Sol_347 {
	
	public List<Integer> topKFrequent(int[] nums, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer>[] bucket = new List[nums.length + 1];
		
		
		for (int i : nums)
			map.put(i, map.getOrDefault(i, 0) + 1);getClass();
			
		for (int key : map.keySet())  {
			int freq = map.get(key);
			
			if (bucket[freq] == null) {
				List<Integer> integers = new LinkedList<Integer>();
				integers.add(key);
				bucket[freq] = integers;
			} else
				bucket[freq].add(key);
		}
		
		List<Integer> res = new LinkedList<Integer>();
		
		for (int pos = bucket.length - 1; pos >= 0 && res.size() < k ; pos--) {
			if (bucket[pos] != null)
				res.addAll(bucket[pos]);
		}
		
		return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
