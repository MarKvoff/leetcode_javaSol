package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 520. Detect Capital
 * 
 * @author czm
 * 
 *
 */
public class Sol_520 {
	
	public boolean detectCapitalUse(String word) {
		
		char[] chars = word.toCharArray();
        
        if (chars.length == 1)
            return true;
		
		char one = chars[0];
		
		if (one >= 65 && one <=90) {
			if (chars[1] >= 97 && chars[1] <= 122) {
				for (int i = 2; i < chars.length; i++)
					if (chars[i] < 97)
						return false;
			} else {
				for (int i = 1; i < chars.length; i++)
					if (chars[i] > 90)
						return false;
			}
		} else
		    for (int i = 1; i < chars.length; i++)
			    if (chars[i] < 97)
				    return false;
		
        return true;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'a', b = 'z', c = 'A', d = 'Z';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
