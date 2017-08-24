package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 2. Add Two Numbers
 * 
 * 
 * @author czm
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import java.util.Random;


public class Sol_2 {
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x; 
		}
	}
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode a = l1;
		ListNode b = l2;
		
		ListNode k = new ListNode(-1);
		ListNode root = k;
		
		int leak = 0;
		int val = 0;
		
		while(true) {
            ListNode t = k;
			if ((a == null) && (b == null)) {
				if (leak != 0) {
					k = new ListNode(leak);
                    t.next = k;
                }
				break;
			} else if ((a != null) && (b == null)) {
				val = (a.val + leak)%10;
				leak = (a.val + leak)/10;
				a = a.next;
			} else if ((a == null) && (b != null)) {
				val = (b.val + leak)%10;
				leak = (b.val + leak)/10;
				b = b.next;
			} else {
				val = (a.val + b.val + leak)%10;
				leak = (a.val + b.val + leak)/10;
				a = a.next;
				b = b.next;
			}
			k = new ListNode(val);
            t.next = k;
		}
		return root.next;
    }
		
	
}














