package leetcode_sol;
/**
 * This is the solution for problems in leetcode.com 
 * Question 11. Container With Most Water
 * 
 * @author czm
 *
 */


public class Sol_11 {
	
	public int maxArea(int[] height) {
		int maxArea = 0;
		int lo = 0, hi = height.length-1;

		while(lo < hi) {
			int area = (hi - lo)*Math.min(height[lo], height[hi]);
			maxArea = Math.max(area, maxArea);
			if (height[lo] < height[hi])
				lo++;
			else
				hi--;
		}
		return maxArea;
    }
}
