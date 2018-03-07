package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 467. Unique Substrings in Wraparound String
 * 
 * @author czm
 * 
 */
public class Sol_467 {
	
	public int findSubstringInWraproundString(String p) {
		if (p.length() == 0)
            return 0;
        
        int[] count = new int[26];
        
        String continus = "" + p.charAt(0);
        count[p.charAt(0) - 'a']++;
        
        
        for (int i = 1; i < p.length(); i++) {
            
            if (p.charAt(i - 1) + 1 == p.charAt(i) || p.charAt(i-1) - p.charAt(i) == 25) {
                continus = continus + p.charAt(i);
                
            } else  {
                continus = "" + p.charAt(i);
            }
            count[p.charAt(i) - 'a'] = Math.max(continus.length(), count[p.charAt(i) - 'a']);

        }
        
        int num = 0;
        for (int i : count)
            num += i;
        return num;
        
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
