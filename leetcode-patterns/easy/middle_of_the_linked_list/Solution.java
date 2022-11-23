package middle_of_the_linked_list;

import common.ListNode;

public class Solution {

    public static ListNode middleNode(ListNode head) {
        int index = getCount(head) / 2;
        int curIndex = 0;
        while (head != null) {
            if (curIndex == index) {
                return head;
            }
            head = head.next;
            curIndex++;
        }
        return head;
    }

    // excellent solution with two pointers
    // when fast reaches the end slow will be on the middle
    public static ListNode middleNodeExcellent(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int getCount(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }

        return count;
    }
}
