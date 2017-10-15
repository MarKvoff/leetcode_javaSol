package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 83. Remove Duplicates from Sorted List
 * 
 * @author czm
 * 
 *
 */
public class Sol_83 {
	
	public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null)
            return head;
        
        int nowVal = head.val;
        ListNode pos = head;
        
        while (pos.next != null) {
            if (nowVal == pos.next.val){
                pos.next = pos.next.next;
                
            } else{
                pos = pos.next;
                nowVal = pos.val;
            }
        }
        
        return head;
        
    }
	
	 private class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }

}
