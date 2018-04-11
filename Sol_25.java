package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 25. Reverse Nodes in k-Group
 * 
 * @author czm
 * 
 *
 */
public class Sol_25 {
	
		public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode curr = head;
        int count = 0;
        
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        if (count == k) {
            curr = reverseKGroup(curr, k);
            
            while (count > 0) {
                ListNode tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
                count--;
            }
            head = curr;
            
        }
        
        return head;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
