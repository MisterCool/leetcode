package remove_duplicates_from_sorted_list_2;

import common.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode left = dummy;
        ListNode right = head;
        left.next = right;

        while(right != null) {
            while(right.next != null && right.val == right.next.val) {
                right = right.next;
            }
            if(left.next != right)  {
                left.next = right.next;
                right = right.next;
            }   else {
                left = left.next;
                right = right.next;
            }
        }

        return dummy.next;
    }
}
