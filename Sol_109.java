package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 109. Convert Sorted List to Binary Search Tree
 * 
 * @author czm
 * 
 *
 */
public class Sol_109 {
	
	public TreeNode sortedListToBST(ListNode head) {
        
        return builder(head, null);
        
    }
    
    public TreeNode builder(ListNode head, ListNode tail) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        if (head == tail)
            return null;
        
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode node = new TreeNode(slow.val);
        node.left = builder(head, slow);
        node.right = builder(slow.next, tail);
        return node;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
