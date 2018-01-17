package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 86. Partition List
 * 
 * @author czm
 *
 */
public class Sol_86 {
	
	public ListNode partition(ListNode head, int x) {
		
		ListNode smaller = new ListNode(0);
		ListNode bigger = new ListNode(0);
		
		ListNode curr1 = smaller, curr2 = bigger;
		while (head != null) {
			
			if (head.val < x) {
				curr1.next = head;
				curr1 = head;
			} else {
				curr2.next = head;
				curr2 = head;
			}
			head = head.next;
		}
		curr2.next = null;
		curr1.next = bigger.next;
		
		return smaller.next;
        
    }

}
