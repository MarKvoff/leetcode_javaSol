package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 392. Is Subsequence
 * 
 * @author czm
 * 
 */
public class Sol_392 {
	
	public static boolean isSubsequence(String s, String t) {
		
		int posS = 0, posT = 0;
        
        while(posS < s.length() && posT < t.length()) {
            
            if (s.charAt(posS) == t.charAt(posT)) {
                posS++;
                posT++;
            } else
                posT++;
        }
        System.out.println(posS);
        
        if (posS == s.length())
            return true;
        else
            return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sol_392.isSubsequence("abc", "adbxc");
		

	}

}
