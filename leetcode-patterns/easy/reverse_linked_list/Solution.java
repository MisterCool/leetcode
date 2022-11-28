package reverse_linked_list;

import common.ListNode;

public class Solution {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static ListNode reverseListRec(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }

        ListNode next = head.next;
        head.next = prev;

        return reverseListRec(next, head);
    }
}
