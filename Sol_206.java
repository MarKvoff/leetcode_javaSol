package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 206. Reverse Linked List
 * 
 * @author czm
 * 
 *
 */
public class Sol_206 {
	
	public ListNode reverseList(ListNode head) {
		
		ListNode newHead = null, tmp;
		
		while (head != null) {
			tmp = head;
			head = head.next;
			tmp.next = newHead;
			newHead = tmp;
		}
		
        return newHead;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
