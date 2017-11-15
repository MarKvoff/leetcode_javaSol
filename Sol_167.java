package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 167. Two Sum II - Input array is sorted
 * 
 * @author czm
 * 
 *
 */
public class Sol_167 {
	
	public int[] twoSum(int[] numbers, int target) {
        
        int[] indexs = new int[2];
        int index1 = 0, index2 = numbers.length - 1;
        
        while (true) {
            int sum = numbers[index1] + numbers[index2];
            
            if (sum == target) {
                indexs[0] = index1+1;
                indexs[1] = index2+1;
                break;
            }
            
            if (sum < target)
                index1++;
            if (sum > target)
                index2--;

        }
        return indexs;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
