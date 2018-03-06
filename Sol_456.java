package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 456. 132 Pattern
 * 
 * @author czm
 * 
 */
public class Sol_456 {
	
	public static boolean find132pattern(int[] nums) {
        
        int stack = 0;
        int pos = 1;
        
        while (pos < nums.length && nums[pos - 1] < nums[pos])
            pos++;
        if (pos != nums.length)
            stack++;
        
        while (pos < nums.length && nums[pos - 1] > nums[pos])
            pos++;
        if (pos != nums.length)
            stack++;
        System.out.println(stack);
        while (pos < nums.length && nums[pos - 1] < nums[pos])
            pos++;
        if (pos != nums.length)
            stack++;
        
        System.out.println(stack);
        return stack == 3;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] in = {-1,3,2,0};
		Sol_456.find132pattern(in);

	}

}
