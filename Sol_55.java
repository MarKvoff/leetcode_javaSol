/** 
* This is the solution for problems in leetcode.com  
* Question 55. Jump Game
*  
* @author czm 
* 
* 
*/


public class Sol_55 {
	
	public boolean canJump(int[] nums) {
        int maxDistance = 0;
        int pos = 0;
        while (maxDistance < nums.length-1){
            if (pos == nums.length-1)
                return false;
            maxDistance = Math.max(maxDistance, nums[pos]+pos);
            if (maxDistance == pos && nums[pos] == 0)
                return false;
            pos++;
        }
        return true;
    }

}
