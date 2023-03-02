package meeting_rooms_II;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        new Solution().minMeetingRooms(List.of(new Interval(4, 16), new Interval(4, 17), new Interval(5, 17), new Interval(12, 17)));

        List<Interval> list = new ArrayList<>();
        list.add(new Interval(0, 30));
        list.add(new Interval(5, 10));
        list.add(new Interval(15, 20));
        new Solution().minMeetingRooms1(list);
    }
}
