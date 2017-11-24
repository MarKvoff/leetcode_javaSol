package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com 
 * Question 257. Binary Tree Paths
 * 
 * @author czm
 * 
 * The problem, widely known as digit root problem, has a congruence formula:
 * https://en.wikipedia.org/wiki/Digital_root#Congruence_formula
 * 
 *
 */
public class Sol_258 {
	
	
	public int addDigits(int num) {

        return num==0?0:(num%9==0?9:(num%9));

    }

}
