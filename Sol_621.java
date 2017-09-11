package leetcode_sol;

import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 621. Task Scheduler
 * 
 * @author czm
 * The longest interval is determined by the task which has the most times of appearence.
 *
 */
public class Sol_621 {
	
	public int leastInterval(char[] tasks, int n) {
		int[] map = new int[26];
		for (char c : tasks)
			map[c - 'A']++;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(26, Collections.reverseOrder());
		for (int i : map)
			if (i > 0)
				pq.add(i);
		
		int time = 0;
		while(!pq.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<>();
			int index = 0;
			while(index <= n) {
				if (!pq.isEmpty()) {
					if (pq.peek() > 1)
						list.add(pq.poll()-1);
					else pq.poll();
				}
				time++;
				if (pq.isEmpty() && list.size()==0)
					break;
				index++;	
			}
			for (int i : list)
				pq.add(i);
		}
		return time;
    }
	
}
