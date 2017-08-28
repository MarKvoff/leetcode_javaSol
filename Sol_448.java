/** 
3  * This is the solution for problems in leetcode.com  
4  * Question 448. Find All Numbers Disappeared in an Array
5  *  
6  * @author czm 
7  * 
8  */ 

import java.util.*;


public class Sol_448 {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> notIn = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++){
			int val = Math.abs(nums[i]) - 1;
			nums[val] = -nums[val];
		}
		
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 0)
				notIn.add(i+1);
        return notIn;
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
