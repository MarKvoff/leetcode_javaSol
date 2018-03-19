package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 725. Split Linked List in Parts
 * 
 * @author czm
 * 
 *
 */
public class Sol_725 {
	
	public ListNode[] splitListToParts(ListNode root, int k) {
        
        ListNode[] res = new ListNode[k];
        int len = 0;
        ListNode pos = root;
        while(pos != null) {
            len++;
            pos = pos.next;
        }
        
        int n = len / k, r = len % k;
        ListNode head = root;
        for (int i = 1; head != null && i <= k; i++, r--) {
            pos = head;
            for (int j = 1; j < n + (r > 0 ? 1 : 0); j++) {
                pos = pos.next;
            }
            res[i - 1] = head;
            head = pos.next;
            pos.next = null;
            
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
