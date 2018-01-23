package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 138. Copy List with Random Pointer
 * 
 * @author czm
 *
 */
public class Sol_138 {
	
	public RandomListNode copyRandomList(RandomListNode head) {
	
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		
		RandomListNode cur = head;
		
		while (cur != null) {
			map.put(cur, new RandomListNode(cur.label));
			cur = cur.next;
		}
		
		RandomListNode newHead = new RandomListNode(0);
		RandomListNode pos = newHead;
		cur = head;
		
		while(cur != null) {
			pos.next = map.get(cur);
			pos.next.random = map.get(cur.random);
			pos = pos.next;
			cur = cur.next;
		}
		
		return newHead.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class RandomListNode {
	int label;
	RandomListNode next, random;
	RandomListNode(int x) { this.label = x; }
}
