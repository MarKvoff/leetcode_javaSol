package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 143. Reorder List
 * 
 * @author czm
 *
 */
public class Sol_143 {
	
	public void reorderList(ListNode head) {
		
		// find the mid
		ListNode dim = new ListNode(0);
		dim.next = head;
		ListNode slow = dim, fast = dim;
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
			if (fast.next == null)
				break;
			fast = fast.next;
		}
		
		// reverse the second half part from slow
		ListNode pos = slow.next;
		ListNode rev = null;
		while(pos != null) {
			ListNode tmp = pos;
			slow.next = pos.next;
			pos = pos.next;
			tmp.next = rev;
			rev = tmp;
		}
		
		// insert the reversed list
		pos = head;
		while (rev != null) {
			ListNode tmp = pos.next;
			pos.next = rev;
			ListNode tmp2 = rev.next;
			rev.next = tmp;
			pos = tmp;
			rev = tmp2;
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
