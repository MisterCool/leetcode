package sort_list;

public class Solution {

    public ListNode sortList(ListNode head) {
        return sortListRec(head, null);
    }

    private ListNode sortListRec(ListNode start, ListNode end) {
        if (start == end) {
            return start;
        }

        ListNode slow = start;
        ListNode fast = start;

        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode left = sortListRec(start, slow);
        ListNode right = sortListRec(slow.next, end);

        return mergeList(left, right);
    }

    private ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode point = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                point.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                point.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            point = point.next;
        }

        if (l1 != null) point.next = l1;
        if (l2 != null) point.next = l2;

        return result.next;
    }
}
