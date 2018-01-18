package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 92. Reverse Linked List II
 * 
 * @author czm
 * 
 *
 */
public class Sol_92 {
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		
		int count = 1;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		
		ListNode reversed = new ListNode(0);
		ListNode revPos = reversed;
		
		while(count < m) {
			head = head.next;
			count++;
		}
		
		ListNode pos = head.next;
		ListNode revTail = pos;
		head.next = null;
		count = 0;
		
		while (count < n - m + 1) {
			ListNode tmp = reversed.next;
			reversed.next = pos;
			pos = pos.next;
			reversed.next.next = tmp;
			count++;
		}
		
		revTail.next = pos;
		head.next = reversed.next;
		
		return dummy.next;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
