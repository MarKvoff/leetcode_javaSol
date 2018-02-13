package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 331. Verify Preorder Serialization of a Binary Tree
 * 
 * @author czm
 * 
 */
public class Sol_331 {
	
	public static boolean isValidSerialization(String preorder) {
		
		String[] tree = preorder.split(",");
		int nodes = 0, index = 0;
		
		for (; index < tree.length; index++) {
			
			//System.out.println(nodes);
			
			if (tree[index].equals("#"))
				if (nodes == 0)
					break;
				else
					nodes--;
			else
				nodes++;
			
		}
		
		return nodes == 0 && index == tree.length - 1;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tree = "#,7,6,9,#,#,#";
		
		boolean res = Sol_331.isValidSerialization(tree);
		System.out.println(res);

	}

}
