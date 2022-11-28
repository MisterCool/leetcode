package merge_two_sorted_lists;

import common.ListNode;

public class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result = new ListNode(0);
        ListNode resultPointer = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                resultPointer.next = list1;
                list1 = list1.next;
            } else {
                resultPointer.next = list2;
                list2 = list2.next;
            }
            resultPointer = resultPointer.next;
        }

        if (list1 != null) resultPointer.next = list1;
        if (list2 != null) resultPointer.next = list2;
        return result.next;
    }

    public static ListNode mergeTwoListsRec(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRec(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRec(list1, list2.next);
            return list2;
        }
    }
}
