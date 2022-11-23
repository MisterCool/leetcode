package remove_linked_list_elements;

import common.ListNode;

public class Solution {

    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return head;


        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;

            }
        }

        return head;
    }
}
