package leetcode_sol;
import java.util.*;


/**
 * This is the solution for problems in leetcode.com
 * Question 179. Largest Number
 * 
 * @author czm
 * 
 *
 */
public class Sol_179 {
	
	public String largestNumber(int[] nums) {
		
		String[] toSort = new String[nums.length];
		
		for (int i = 0; i < nums.length; i++)
			toSort[i] = String.valueOf(nums[i]);
		
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				
				String i = a + b;
				String j = b + a;
				return j.compareTo(i);
			}
		};
		
		Arrays.sort(toSort, comp);
		if (toSort[0].charAt(0) == '0')
			return "0";
        
		
		StringBuilder res = new StringBuilder();
		for (String i : toSort)
			res.append(i);
		
		return res.toString();
		
    }
	
	
	private boolean firstNumberIsLarger(int a, int b) {
		
		String i = Integer.toString(a), j = Integer.toString(b);
		int indexa = 0, indexb = 0;
		
		while (true) {
			if (indexa == i.length() - 1 && indexb == j.length() - 1)
				return Integer.valueOf(i.charAt(indexa)) > Integer.valueOf(j.charAt(indexb)) ? true : false;
			
			if (indexa == i.length() - 1 && Integer.valueOf(i.charAt(indexa)) == Integer.valueOf(j.charAt(indexb))) {
				indexb++;
				continue;
			}
			
			if (indexb == j.length() - 1 && Integer.valueOf(i.charAt(indexa)) == Integer.valueOf(j.charAt(indexb))) {
				indexa++;
				continue;
			}
			
			if (Integer.valueOf(i.charAt(indexa)) == Integer.valueOf(j.charAt(indexb))) {
				indexa++;
				indexb++;
				continue;
			}
			
			return Integer.valueOf(i.charAt(indexa)) > Integer.valueOf(j.charAt(indexb)) ? true : false;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Integer.valueOf("00120"));

	}

}
