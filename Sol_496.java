package leetcode_sol;
import java.util.*;


/**
 * This is the solution for problems in leetcode.com 
 * Question 496. Next Greater Element I
 * 
 * @author czm
 * 
 *
 */
public class Sol_496 {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int num : nums2) {
			while (!stack.isEmpty() && num > stack.peek())
				map.put(stack.pop(), num);
			stack.push(num);
		}
		
		while (!stack.isEmpty())
			map.put(stack.pop(), -1);
		
		for (int i = 0; i < nums1.length; i++)
			nums1[i] = map.get(nums1[i]);
		
		return nums1;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
