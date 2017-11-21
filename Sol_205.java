package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 205. Isomorphic Strings
 * 
 * @author czm
 * 
 *
 */
public class Sol_205 {
	
	public static boolean isIsomorphic(String s, String t) {
        
		int[] mapTable = new int[700];
		
		for (int i = 0; i < s.length(); i++) {
			if (mapTable[s.charAt(i)] != mapTable[t.charAt(i) + 300])
				return false;
			mapTable[s.charAt(i)] = mapTable[t.charAt(i) + 300] = s.charAt(i);
		}
		return true;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean i = Sol_205.isIsomorphic("poo", "nis");
		System.out.println(i);

	}

}
