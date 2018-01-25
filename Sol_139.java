package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 106. Construct Binary Tree from Inorder and Postorder Traversal
 * 
 * @author czm
 * 
 *
 */
public class Sol_139 {
	
	public boolean wordBreak(String s, List<String> wordDict) {
		
		boolean[] A = new boolean[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j >= 0; j--) {
				
				if (j == i) 
					if (wordDict.contains(s.substring(0, i+1))) {
						A[i] = true;
						break;
					}
				
				if (A[j] == true)
					if (wordDict.contains(s.substring(j + 1, i + 1))) {
						A[i] = true;
						break;
					}
			}
		}
		
		return A[A.length - 1];
		
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "asdf";
		System.out.println(s.substring(0,1));

	}

}
