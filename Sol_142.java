package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 142. Linked List Cycle II
 * 
 * @author czm
 * 
 *
 */
public class Sol_142 {
	
	public ListNode detectCycle(ListNode head) {
		
		Set<ListNode> set = new HashSet<ListNode>();
		ListNode pos = head;
		
		while(pos != null)  {
			
			if (!set.add(pos))
				return pos;
			pos = pos.next;
		}
		
		return pos;

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
