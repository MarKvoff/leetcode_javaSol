package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 740. Delete and Earn
 * 
 * @author czm
 * 
 *
 */
public class Sol_740 {
	
	public int deleteAndEarn(int[] nums) {
        
        int[] map = new int[10001];
        int max = 0;
        for (int i : nums) {
            map[i] += i;
            max = Math.max(max, i);
        }
        
        int lastHold = 0, lastNotHold = 0;
        for (int i = 1; i <= max; i++) {
            int takei = lastNotHold + map[i];
            int skipi = Math.max(lastHold, lastNotHold);
            lastHold = takei;
            lastNotHold = skipi;
            
        }
        
        return Math.max(lastHold, lastNotHold);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
