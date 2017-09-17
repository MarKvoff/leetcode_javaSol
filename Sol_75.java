package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 75. Sort Colors
 * 
 * @author czm
 * 
 *
 */
public class Sol_75 {
	
	public void sortColors(int[] nums) {
        if (nums == null)
            return;
        int red = 0, blue = nums.length-1;
        int index = 0;
        while (index <= blue){
            if (nums[index] == 0){
                int tmp = nums[red];
                nums[red++] = nums[index];
                nums[index++] = tmp;
            }
            else if (nums[index] == 1)
                index++;
            else {
                nums[index] = nums[blue];
                nums[blue--] = 2;
            }
        }
    }

}
