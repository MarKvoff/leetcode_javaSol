package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 203. Remove Linked List Elements
 * 
 * @author czm
 * 
 * 
 */
public class Sol_203 {
	
	public ListNode removeElements(ListNode head, int val) {
		
		if (head == null)
			return null;
		
		ListNode pos = head;
		
		while (pos.next != null) {
			if (pos.next.val == val)
				pos.next = pos.next.next;
			else
				pos = pos.next;
		}
		
		if (head.val == val)
			head = head.next;
			
		return head;
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
     ListNode(int x) { val = x; }
}


