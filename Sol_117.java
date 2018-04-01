package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 117. Populating Next Right Pointers in Each Node II
 * 
 * @author czm
 *
 */
public class Sol_117 {
	
public void connect(TreeLinkNode root) {
        
        TreeLinkNode head = null;
        TreeLinkNode prev = null;
        TreeLinkNode curr = root;
        
        
        while (curr != null) {
            
            while (curr != null) {
                //deal with left child
                if (curr.left != null) {
                    if (prev != null)
                        prev.next = curr.left;
                    else
                        head = curr.left;
                    prev = curr.left;
                }
                
                //deal with right child
                if (curr.right != null) {
                    
                    if (prev != null)
                        prev.next = curr.right;
                    else
                        head = curr.right;
                    prev = curr.right;
                }
                curr = curr.next;
                
            }
            
            curr = head;
            head = null;
            prev = null;
            
        }
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
