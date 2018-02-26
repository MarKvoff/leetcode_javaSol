package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 395. Longest Substring with At Least K Repeating Characters
 * 
 * @author czm
 * 
 */
public class Sol_395 {
	
public int longestSubstring(String s, int k) {
		
		char[] string = s.toCharArray();
		return helper(string, k, 0, string.length - 1);
        
    }
	
	private int helper(char[] string, int k, int start, int end) {
        
        if (end  - start  + 1 < k)
            return 0;
	    
        int[] freq = new int[26];
        
        for (int i = start; i <=  end; i++)
            freq[string[i] - 'a']++;
        
        for (int i = 0; i < 26; i++) {
            
            int count = freq[i];
            if (count > 0 && count < k) {
                for (int j = start; j <= end; j++) {
                    if (string[j] - 'a' == i) {
                        int left = helper(string, k, start, j - 1);
                        int right = helper(string, k, j + 1, end);
                        return Math.max(left, right);
                    }
                }   
            }   
        }
        
        return end - start + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println('a' - 'b');

	}

}
