package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 21. Merge Two Sorted Lists
 * 
 * @author czm
 * 
 *
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode pos = head;
            
        while (!(l1 == null && l2 == null)){
            
            pos.next = new ListNode(0);
            pos = pos.next;
            
            if (l1 == null) {
                pos.val = l2.val;
                l2 = l2.next;
            } else if (l2 == null){
                pos.val = l1.val;
                l1 = l1.next;
            } else if (l1.val > l2.val){
                pos.val = l2.val;
                l2 = l2.next;
            } else{
                pos.val = l1.val;
                l1 = l1.next;
            }
            
        }
        
        return head.next;
        
    }
    
    private class ListNode {
    	     int val;
    	     ListNode next;
    	     ListNode(int x) { val = x; }
    }
}
