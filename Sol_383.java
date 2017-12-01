package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 383. Ransom Note
 * 
 * @author czm
 * 
 *
 */
public class Sol_383 {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		
		int[] map = new int[26];
		
		for (int i = 0; i < magazine.length(); i++) 
			map[magazine.charAt(i) - 97]++;
		
		
		for (int i = 0; i < ransomNote.length(); i++) 
			map[ransomNote.charAt(i)-97]--;
		
		for (int i : map)
			if (i < 0)
				return false;
        
        return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 'a';
		System.out.println(i);

	}

}
