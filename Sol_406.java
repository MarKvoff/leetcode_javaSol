package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 406. Queue Reconstruction by Height
 * 
 * @author czm
 * 
 */
public class Sol_406 {
	
	public int[][] reconstructQueue(int[][] people) {
		
		int number = people.length;
        for (int i = 0; i < number; i++)
            for (int j = i + 1; j < number; j++) {
                if (people[i][0] < people[j][0])
                    swap(people, i, j);
                else if (people[i][0] == people[j][0] && people[i][1] > people[j][1])
                    swap(people, i, j);
            }
        
        
        List<Integer> hList = new ArrayList<Integer>();
        List<Integer> kList = new ArrayList<Integer>();
		
		
        for (int i = 0; i < number; i++) {
        		hList.add(people[i][1], people[i][0]);
        		kList.add(people[i][1], people[i][1]);
        }
		
        for (int i = 0; i < number; i++) {
            people[i][0] = hList.get(i);
            people[i][1] = kList.get(i);
        }
		
        return people;
    }
	
	private void swap(int[][] people, int a, int b) {
        
        int h = people[a][0];
        int k = people[a][1];
        
        people[a][0] = people[b][0];
        people[a][1] = people[b][1];
        people[b][0] = h;
        people[b][1] = k;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
