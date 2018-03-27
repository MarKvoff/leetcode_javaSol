package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 131. Palindrome Partitioning
 * 
 * @author czm
 *
 */
public class Sol_131 {
	
	public List<List<String>> partition(String s) {
        
        List<List<String>> res = new LinkedList<List<String>>();
        backtrack(res, new LinkedList<String>(), s, 0);
        return res;
        
    }
    
    
    private void backtrack(List<List<String>> list, List<String> temp, String s, int index) {
        
        if (index == s.length()) {
            list.add(new ArrayList<String>(temp));
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                temp.add(s.substring(index, i + 1));
                backtrack(list, temp, s, i + 1);
                temp.remove(temp.size() - 1);
                
            }
            
        }
        
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> test = new LinkedList<>();
		test.add("a");
		String a = test.get(0);
		a = "b";
		System.out.println(test.get(0));
		
		
		

	}

}
