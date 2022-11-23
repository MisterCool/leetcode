package middle_of_the_linked_list;

import common.ListNode;

import static middle_of_the_linked_list.Solution.middleNodeExcellent;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5, new ListNode(6))))));

        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5)))));

        System.out.println(middleNodeExcellent(head).val);
//        System.out.println(middleNode(head1).val);
    }
}
