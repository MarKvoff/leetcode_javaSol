package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 424. Longest Repeating Character Replacement
 * 
 * @author czm
 * 
 */
public class Sol_424 {
	
	public int characterReplacement(String s, int k) {
		
		int[] count = new int[26];
        int start = 0, end = 0;
        int maxLen = 0, maxcount = 0;
        
        for (end = 0; end < s.length(); end++) {

            maxcount = Math.max(++count[s.charAt(end) - 'A'], maxcount);
            
            while(end - start + 1 > k + maxcount) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            
        }
        
        return maxLen;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
