package palindrome_linked_list;


import common.ListNode;

import static palindrome_linked_list.Solution.isPalindrome;

// https://leetcode.com/problems/palindrome-linked-list/
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(3, new ListNode(2, new ListNode(1))))));

        System.out.println(isPalindrome(head));
    }
}
