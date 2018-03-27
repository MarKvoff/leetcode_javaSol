package leetcode_sol;

public class Sol_60 {
	
	private String res;
    private int count;
    public String getPermutation(int n, int k) {
        count = 0;
        boolean[] pick = new boolean[n + 1];
        backtrack("", n, k, pick);
        return res;
        
    } 
    
    
    public void backtrack(String temp, int n, int k, boolean[] pick) {
        
        if (temp.length() == n) {
            count++;
            return;
        }
        
        if (count == k) {
            res = temp;
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            if (pick[i])
                continue;
            temp = temp + i;
            pick[i] = true;
            backtrack(temp, n, k, pick);
            pick[i] = false;
            temp = temp.substring(0, temp.length() - 1);
            
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
