package linked_list_cycle;

import static linked_list_cycle.Solution.hasCycle;

// https://leetcode.com/problems/linked-list-cycle/
public class Main {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);

        listNode1.next = listNode2;
        listNode2.next  = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;

        System.out.println(hasCycle(listNode1));
    }
}
