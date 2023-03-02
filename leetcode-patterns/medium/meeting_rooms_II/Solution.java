package meeting_rooms_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Solution {
    // if we met start we have to increase room count else if we met end we have to decrease room count
    public int minMeetingRooms(List<Interval> intervals) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = 0;
        int cur = 0;
        for(Interval interval : intervals) {
            int start = interval.start;
            int end = interval.end;

            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);
        }

        for(Integer key: map.keySet())  {
            cur+=map.get(key);
            ans = Math.max(ans, cur);
        }

        return ans;
    }

    // with PriorityQueue
    public int minMeetingRooms1(List<Interval> intervals) {
        if(intervals ==null || intervals.size() == 0) return 0;
        // sort the arrays by start time

        intervals.sort((a, b) -> a.start - b.start);
        // sort the heap by end time (scheduled meeting)
        PriorityQueue<Interval> pq = new PriorityQueue<>(intervals.size(), Comparator.comparingInt(a -> a.end));

        pq.offer(intervals.get(0));

        for(int i = 1; i < intervals.size(); i++){
            Interval earliest = pq.poll();
            Interval curInterval = intervals.get(i);

            if(earliest.end <= curInterval.start){
                earliest.end = curInterval.end; // merge (use the same room)
            }
            else {
                pq.offer(curInterval); // schedule a new room
            }

            pq.offer(earliest);
        }

        return pq.size();
    }
}
