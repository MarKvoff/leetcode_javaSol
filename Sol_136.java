package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 136. Single Number
 * 
 * @author czm
 * 
 *
 */
public class Sol_136 {
	
	public int singleNumber(int[] nums) {
		
		int singleone = 0;
        
        for (int i = 0; i < nums.length; i++){
            singleone ^= nums[i]; 
        }
        
        return singleone;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
