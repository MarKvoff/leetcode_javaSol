package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 445. Add Two Numbers II
 * 
 * @author czm
 * 
 */
public class Sol_445 {
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode resHead = new ListNode(0);
		
		int num1 = 0, num2 = 0;
		
		while(l1 != null || l2 != null) {
			
			if (l1 != null) { 
				num1 = num1 * 10 + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				num2 = num2 * 10 + l2.val;
				l2 = l2.next;
			}
		}
		
		num1 += num2;
		System.out.println(num1);
		String res = "" + num1;
		ListNode pos = resHead;
		for (int i = 0; i < res.length(); i++) {
			pos.next = new ListNode(res.charAt(i) - '0');
			pos = pos.next;
		}
		return resHead.next;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
