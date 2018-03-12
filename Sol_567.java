package leetcode_sol;

public class Sol_567 {
	
	public boolean checkInclusion(String s1, String s2) {
        
        int count = 0;
        int[] chars = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            count++;
        }
        
        for (int i = 0; i < s2.length(); i++) {
            if (chars[s2.charAt(i) - 'a'] == 0)
                continue;
            
            int sum = count, end = i;
            int[] chars2 = new int[26];
            for (int j = 0; j < 26; j++)
                chars2[j] = chars[j];
            
            while (end < s2.length() && chars2[s2.charAt(end) - 'a'] != 0){
                sum--;
                chars2[s2.charAt(end) - 'a']--;
                end++;
            }
            
            if (end <= s2.length() && sum == 0)
                return true;
        
        }
        
        
        return false;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
