package leetcode._435;

import java.util.Arrays;
import java.util.Comparator;

public class _435 {
}
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals==null||intervals.length<=0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(t->t.end));
        int end = intervals[0].end;
        int cnt = 1;
        for(int i =0;i<intervals.length;i++){
            if(intervals[i].start<end){
                continue;
            }
            end = intervals[i].end;
            cnt++;
        }

        return  intervals.length-cnt;
    }
}