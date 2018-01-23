package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 116. Populating Next Right Pointers in Each Node
 * 
 * @author czm
 *
 */
public class Sol_116 {
	
	public void connect(TreeLinkNode root) {
		
		if(root == null || root.left == null)
			return;
		
		root.left.next = root.right;
		TreeLinkNode levelHead = root.left;
		
		
		while (levelHead.left != null) {
			TreeLinkNode left = levelHead;
			TreeLinkNode right = levelHead.next;
			while (right != null) {
				left.left.next = left.right;
				left.right.next = right.left;
				right.left.next = right.right;
				left = left.next;
				right = right.next;
			}
			levelHead = levelHead.left;
			
		}
		
		return;
    }

}

/**
 * Definition for binary tree with next pointer.
 */
class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) { val = x; }
}
