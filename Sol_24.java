package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 24. Swap Nodes in Pairs
 * 
 * @author czm
 *
 */
public class Sol_24 {
	
	public ListNode swapPairs(ListNode head) {
		
		if (head == null)
			return null;
		
		if (head.next == null)
			return head;
		
		ListNode tmp = head.next;
		head.next = tmp.next;
		tmp.next = head;
		
		head.next = swapPairs(head.next);
		
		return tmp;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
