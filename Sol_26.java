/** 
* This is the solution for problems in leetcode.com  
* Question 26. Remove Duplicates from Sorted Array
*  
* @author czm 
* 
*/

public class Sol_26 {
	
	public int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i=1; i < nums.length; i++){
            if (nums[pos] < nums[i])
                nums[++pos] = nums[i];
        }
        return pos+1;
    }

}
