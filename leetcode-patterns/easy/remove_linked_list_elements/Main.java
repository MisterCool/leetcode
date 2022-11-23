package remove_linked_list_elements;

import common.ListNode;

import static remove_linked_list_elements.Solution.removeElements;

// https://leetcode.com/problems/remove-linked-list-elements/
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5, new ListNode(6))))));

        System.out.println(removeElements(head, 3));

    }
}
