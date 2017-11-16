package leetcode_sol;

public class Sol_202 {
	
	public boolean isHappy(int n) {
		
        int fast =  n, slow = n;
        
        do {
        	slow = squareSum(slow);
        	fast = squareSum(fast);
        	fast = squareSum(fast);
        	
        	if (fast == 1)
        		return true;
        } while (fast != slow);
        return false;
        
    }
	
	
	
	public int squareSum(int num) {
		int sum = 0;
		while(num != 0) {
			sum += (num%10)*(num%10);
			num /= 10; 
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
