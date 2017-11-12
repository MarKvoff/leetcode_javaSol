package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 141. Linked List Cycle
 * 
 * @author czm
 * 
 *
 */
public class Sol_141 {
	
	public boolean hasCycle(ListNode head) {
		
		if (head == null)
			return false;
		
		ListNode walker = head, runner = head;
		
		while (true) {
			if (walker.next != null)
				walker = walker.next;
			else
				return false;
			if (runner.next != null) {
				runner = runner.next;
				if (runner.next != null) {
					runner = runner.next;
				    if (runner == walker)
					    return true;
				} else
				    return false;
			}
			else
				return false;
		}
        
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
 