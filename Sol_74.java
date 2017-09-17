package leetcode_sol;


/**
 * This is the solution for problems in leetcode.com 
 * Question 74. Search a 2D Matrix
 * 
 * @author czm
 * 
 *
 */
public class Sol_74 {
	
	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int lo = 0, hi = m*n-1;
        int mid = (lo + hi)/2;
        int row = mid/n, colum = mid%n;
        while(lo <= hi) {
            if (matrix[row][colum] == target)
                return true;
            else if (matrix[row][colum] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
            mid = (lo + hi)/2;
            row = mid/n;
            colum = mid%n;
        }
        return false;
        
        
    }

}
