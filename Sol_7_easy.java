package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 7. Reverse Integer
 * 
 * @author czm
 * 
 *
 */
public class Sol_7_easy {
	
	public int reverse(int x) {
        
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x /= 10; 
            
            
        }
        return rev;
    }

}
