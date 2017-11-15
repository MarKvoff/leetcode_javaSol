package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 189. Rotate Array
 * 
 * @author czm
 * 
 *
 */
public class Sol_189 {
	
	public void rotate(int[] nums, int k) {
		k %= nums.length;
		rotateAll(nums, 0, nums.length-1);
		rotateAll(nums, 0, k-1);
		rotateAll(nums, k, nums.length-1);
        
    }
	
	public void rotateAll(int[] nums, int lo, int hi) {
		while(lo < hi) {
			int tmp = nums[hi];
			nums[hi--] = nums[lo];
			nums[lo++] = tmp;
		}
	}
	
	
	/* wrong answer
	public void rotate(int[] nums, int k) {
        
        if (nums.length == 1)
            return;
        
        int index = 0, len = nums.length, toPut = nums[0];
        
        while(true) {
            int putIndex = (index+k)%len;
            int tmp = nums[putIndex];
            nums[putIndex] = toPut;
            toPut = tmp;
            index = putIndex;
            if (index == 0)
                return;
        }
        
    }
    */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
