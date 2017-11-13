package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 160. Intersection of Two Linked Lists
 * 
 * @author czm
 * 
 *
 */
public class Sol_160 {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if (headA == null || headB == null)
			return null;
		
		ListNode a = headA;
		ListNode b = headB;
		
		while(a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
