package reverse_linked_list;

import common.ListNode;
// https://leetcode.com/problems/reverse-linked-list/
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5, new ListNode(6))))));

        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5, new ListNode(6))))));

//        ListNode listNode = Solution.reverseList(head);
        ListNode listNodeRec = Solution.reverseListRec(head1, null);

    }
}
