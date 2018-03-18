package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 673. Number of Longest Increasing Subsequence
 * 
 * @author czm
 * 
 *
 */
public class Sol_673 {
	
public int findNumberOfLIS(int[] nums) {
        
        int[] len = new int[nums.length];
        int[] cnt = new int[nums.length];
        int num = 0, maxlen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            len[i] = cnt[i] = 1;
            
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (len[i] == len[j] + 1)
                        cnt[i] += cnt[j];
                    if (len[i] < len[j] + 1) {
                        len[i] = len[j] + 1;
                        cnt[i] = cnt[j];
                    
                    }
                }
                
                
            }
            
            if (maxlen == len[i])
                num += cnt[i];
            if (maxlen < len[i]) {
                maxlen = len[i];
                num = cnt[i];
            }
            
        }
        
        return num;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
