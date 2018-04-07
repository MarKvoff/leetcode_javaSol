package leetcode_sol;
import java.util.*;

public class Sol_23 {
	
	public ListNode mergeKLists(ListNode[] lists) {
		
		ListNode head = new ListNode(0);
        ListNode pos = head;
        
        PriorityQueue<ListNode> PQ = new PriorityQueue<ListNode>(lists.length, (a, b) -> a.val - b.val);
        
        for (ListNode l : lists)
            if (l != null)
                PQ.add(l);
        
        while (!PQ.isEmpty()) {
        	pos.next = PQ.poll();
        	pos = pos.next;
        	if (pos.next != null)
        		PQ.add(pos.next);
        	pos.next = null;
            
        }
        
        return head.next;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * 
 * Definition for singly-linked list.
*/
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
