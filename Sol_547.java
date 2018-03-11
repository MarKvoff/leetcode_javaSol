package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 547. Friend Circles
 * 
 * @author czm
 * 
 *
 */
public class Sol_547 {
	
	public int findCircleNum(int[][] M) {
        
        int N = M.length;
        boolean[] picked = new boolean[N];
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            
            if (picked[i])
                continue;
            
            picked[i] = true;
            count++;
            
            findAll(picked, M, i);
        }
        
        return count;
        
    }
    
    private void findAll(boolean[] picked, int[][] M, int target) {
        
        for (int i = 0; i < M.length; i++) {
            if (M[target][i] == 1 && !picked[i]) {
                picked[i] = true;
                findAll(picked, M, i);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
