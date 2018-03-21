package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 763. Partition Labels
 * 
 * @author czm
 * 
 *
 */
public class Sol_763 {
	
	public List<Integer> partitionLabels(String S) {

        
        int[] end = new int[26];
        int len = S.length();
        
        for (int i = 0; i < len; i++) {
            end[S.charAt(i) - 'a'] = i;
        }
        
        
        int front = 0;
        List<Integer> res = new LinkedList<Integer>();
        
        while (front < len) {
            int maxback = end[S.charAt(front) - 'a'];
            int move = front + 1;
            while (move < maxback) {
                maxback = Math.max(end[S.charAt(move) - 'a'], maxback);
                move++;
            }
            res.add(maxback - front + 1);
            front = maxback + 1;
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

