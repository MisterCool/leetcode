package meeting_rooms_II;

import java.util.ArrayList;
import java.util.List;

// https://www.lintcode.com/problem/919/description
public class Main {

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(0, 30));
        list.add(new Interval(5, 10));
        list.add(new Interval(15, 20));
        new Solution().minMeetingRooms1(list);
    }
}
