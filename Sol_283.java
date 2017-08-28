/** 
3  * This is the solution for problems in leetcode.com  
4  * Question 283. Move Zeroes
5  *  
6  * @author czm 
7  * 
8  */ 



public class Sol_283 {
	
	public void moveZeroes(int[] nums) {
		int filledIndex = 0;
		
		for (int i = 0; i < nums.length; i++){
			if (nums[filledIndex] != 0)
				filledIndex++;
			if (nums[i] != 0 ){
				nums[filledIndex++] = nums[i];
				nums[i] = 0;
			}
		}
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
