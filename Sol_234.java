package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 234. Palindrome Linked List
 * 
 * @author czm
 * 
 *
 */
public class Sol_234 {
	
	public boolean isPalindrome(ListNode head) {
		
		if (head == null)
			return true;
		
		ListNode slow = head, fast = head, reversedHead = null, tmp;
		
		boolean isOdd = true;
		
		while(fast.next != null) {
			// first we put fast and slow one step forward together
			tmp = slow;
			slow = slow.next;
			fast = fast.next;
			// now we reversed the passed node by slow pointer
			tmp.next = reversedHead;
			reversedHead = tmp;
			
			if (fast.next == null) {
				isOdd = false;
				break;
			}
			
			fast = fast.next;
		}
		
		if (isOdd)
			slow = slow.next;
		
		while(slow != null) {
			if (slow.val != reversedHead.val)
				return false;
			slow = slow.next;
			reversedHead = reversedHead.next;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
