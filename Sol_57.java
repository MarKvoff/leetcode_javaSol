package leetcode_sol;
import java.util.*;

/**
 * This is the solution for problems in leetcode.com 
 * Question 42. Trapping Rain Water
 * 
 * @author czm
 * 
 *
 */
public class Sol_57 {
	
public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        
        if (newInterval == null)
            return intervals;
        
        List<Interval> res = new LinkedList<>();
        if (intervals == null || intervals.size() == 0) {
            res.add(newInterval);
            return res;
        }
        
        int i = 0;
        for (; i < intervals.size(); i++) {
            if (intervals.get(i).end < newInterval.start)
                res.add(intervals.get(i));
            else
                break;
        }
        
        while (i < intervals.size() && newInterval.end >= intervals.get(i).start) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        
        res.add(newInterval);
        while(i < intervals.size())
            res.add(intervals.get(i++));
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Interval {
	int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }

