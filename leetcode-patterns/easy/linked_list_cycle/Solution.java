package linked_list_cycle;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/linked-list-cycle/discuss/44694/Accepted-clean-Java-solution
public class Solution {


    // my solution with O(n) memory
    public static boolean hasCycle(ListNode head) {
        return recHasCycle(head, new ArrayList<>());
    }

    // excellent solution with two pointers
    public static boolean hasCycleExcellentSolution(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
    public static boolean recHasCycle(ListNode head, List<ListNode> prev) {

        if (head == null) {
            return false;
        }

        for (ListNode node : prev) {
            if (head.next == node) {
                return true;
            }
        }

        prev.add(head);
        head = head.next;
        return recHasCycle(head, prev);
    }
}
