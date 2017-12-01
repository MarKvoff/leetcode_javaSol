package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 344. Reverse String
 * 
 * @author czm
 * 
 *
 */
public class Sol_344 {
	
	public String reverseString(String s) {
		int lo = 0, hi = s.length()-1;
		char[] revers = new char[s.length()];
		
		while (lo <= hi) {
			revers[lo] = s.charAt(hi);
			revers[hi--] = s.charAt(lo++);
		}
		
        return String.valueOf(revers);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "asd";
		System.out.println(s.length());

	}

}
