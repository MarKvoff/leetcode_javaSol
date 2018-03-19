package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 735. Asteroid Collision
 * 
 * @author czm
 * 
 *
 */
public class Sol_735 {
	
public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || stack.peek() * asteroids[i] > 0 || (stack.peek() < 0 && asteroids[i] > 0))
                stack.add(asteroids[i]);
            else {
                while(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0) {
                    int cmp = Math.abs(stack.peek()) - Math.abs(asteroids[i]);
                    if (cmp > 0)
                        asteroids[i] = 0;
                    else if (cmp < 0)
                        stack.pop();
                    else {
                        stack.pop();
                        asteroids[i] = 0;
                    }
                }
                if (asteroids[i] != 0)
                    stack.add(asteroids[i]);
            }
        }
        int size = stack.size();
        int[] res = new int[size];
        while(!stack.isEmpty())
            res[--size] = stack.pop();
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
