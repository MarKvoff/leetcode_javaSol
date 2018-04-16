package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 42. Trapping Rain Water
 * 
 * @author czm
 * 
 *
 */
public class Sol_42 {
	
	public int trap(int[] height) {
        
        int left = 0, right = height.length - 1;
        int count = 0;
        int leftMax = 0, rightMax = 0;
        
        while (left <= right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
            
            if (leftMax < rightMax)
                count += leftMax - height[left++];
            else
                count += rightMax - height[right--];
        }

        return count;
 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
