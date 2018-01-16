package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 82. Remove Duplicates from Sorted List II
 * 
 * @author czm
 * 
 *
 */
public class Sol_82 {
	
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
			return head;
		
		ListNode start = new ListNode(Integer.MAX_VALUE);
		start.next = head;
		head = start;
		
		while (start.next != null) {
			ListNode end = start.next.next;
			if (end == null)
				break;
			
			int i = start.next.val;
			
			if (i == end.val) {
				while (end != null && i == end.val)
					end = end.next;
				start.next = end;
			} else
				start = start.next;
		}
		
        return head.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
