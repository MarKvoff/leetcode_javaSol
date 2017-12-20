package leetcode_sol;

public class Sol_482 {
	
	public String licenseKeyFormatting(String S, int K) {
		
		String S1 = S.replace("-", "");
		S1 = S1.toUpperCase();
		
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < S1.length(); i++)
			str.append(S1.charAt(i));
		
		int len = str.toString().length();
		for (int i = K; i < len; i += K)
			str.insert(len-i, '-');
		
		return str.toString();
		
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
