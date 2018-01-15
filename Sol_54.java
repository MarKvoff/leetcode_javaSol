package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 54. Spiral Matrix
 * 
 * @author czm
 * 
 *
 */
public class Sol_54 {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> res = new ArrayList<Integer>();
		
		int rowBegin = 0, colBegin = 0;
		int rowEnd = matrix.length - 1, colEnd = matrix[0].length - 1;
		
		
		while (rowBegin <= rowEnd && colBegin <= colEnd) {
			System.out.println("round begin");
			
			for (int i = colBegin; i <= colEnd; i++) {
				System.out.println("->");
				res.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			System.out.println("(" +rowBegin + "," + rowEnd + "), (" + colBegin + "," +  colEnd + ")");
			
			
			for (int i = rowBegin; i <= rowEnd; i++) {
				System.out.println("v");
				res.add(matrix[i][colEnd]);
			}
			colEnd--;
			System.out.println("(" +rowBegin + "," + rowEnd + "), (" + colBegin + "," +  colEnd + ")");
			
			if (rowBegin <= rowEnd) {
			for (int i = colEnd; i >= colBegin; i--) {
				System.out.println("<-");
				res.add(matrix[rowEnd][i]);
			}
			rowEnd--;
			}
			
			
			System.out.println("(" +rowBegin + "," + rowEnd + "), (" + colBegin + "," +  colEnd + ")");	
			
			if (colBegin <= colEnd) {
			for (int i = rowEnd; i >= rowBegin; i--) {
				System.out.println("^");
				res.add(matrix[i][colBegin]);
			}
			colBegin++;
			}
			System.out.println("(" +rowBegin + "," + rowEnd + "), (" + colBegin + "," +  colEnd + ")");
		
		}
		
		return res;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i :Sol_54.spiralOrder(a))
			System.out.print(i + ",");
	}

}
