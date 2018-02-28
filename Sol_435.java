package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com
 * Question 435. Non-overlapping Intervals
 * 
 * @author czm
 * 
 */
public class Sol_435 {
	
	public int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals.length == 0)  return 0;

        Arrays.sort(intervals, new myComparator());
        int end = intervals[0].end;
        int count = 1;        

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
                count++;
            }
        }
        return intervals.length - count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class myComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.end - b.end;
        }
    }
	
	

}

class Interval {
	
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
	
}

