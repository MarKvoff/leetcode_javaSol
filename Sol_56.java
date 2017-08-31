/** 
* This is the solution for problems in leetcode.com  
* Question 56. Merge Intervals
*  
* @author czm 
* 
* 
*/

import java.util.*;

class Interval {
	 int start;
	 int end;
	 Interval() { start = 0; end = 0; }
	 Interval(int s, int e) { start = s; end = e; }
}


public class Sol_56 {
	
	
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.size() <= 1)
	        return intervals;
		
		//use the anonymous Comparator
		intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		
		List<Interval> merge = new LinkedList<Interval>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		
		
		for (Interval i : intervals){
			if (end >= i.start)
				end = Math.max(end, i.end);
			else {
				merge.add(new Interval(start, end));
				start = i.start;
				end = i.end;
			}
		}
		merge.add(new Interval(start, end));
        return merge;
    }
}
