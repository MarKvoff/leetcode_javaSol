package leetcode_sol;

import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 118. Pascal's Triangle
 * 
 * @author czm
 * 
 *
 */
public class Sol_118 {
	
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> PascalTriangle = new ArrayList<List<Integer>>();
        if (numRows == 0)
            return PascalTriangle;
		
		ArrayList<Integer> level_1 = new ArrayList<Integer>();
		level_1.add(1);
		PascalTriangle.add(level_1);
		if (numRows == 1)
			return PascalTriangle;
		
		ArrayList<Integer> level_2 = new ArrayList<Integer>();
		level_2.add(1);
		level_2.add(1);
		PascalTriangle.add(level_2);
		if (numRows == 2)
			return PascalTriangle;
		
		for (int i = 3; i <= numRows; i++) {
			ArrayList<Integer> level_i = new ArrayList<Integer>();
			List<Integer> lastLevel = PascalTriangle.get(i-2);
			level_i.add(1);
			for (int j = 0; j < i-2; j++)
				level_i.add(lastLevel.get(j)+lastLevel.get(j+1));
			level_i.add(1);
			PascalTriangle.add(level_i);
		}
		return PascalTriangle;
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
