package merge_two_sorted_lists;

import common.ListNode;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode head1 = new ListNode(1,  new ListNode(3, new ListNode(4)));


        ListNode listNode = Solution.mergeTwoListsRec(head, head1);
    }
}
