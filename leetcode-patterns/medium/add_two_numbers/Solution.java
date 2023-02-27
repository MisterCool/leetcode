package add_two_numbers;

public class Solution {
    public class ListNode {
        int val;
       ListNode next;

        ListNode() {}
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        int rest = 0;
        while(l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int val = (val1 + val2 + rest) % 10;
            rest = (val1 + val2 + rest) / 10;
            ListNode next = new ListNode(val);

            pointer.next = next;
            pointer = next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(rest != 0) {
            pointer.next = new ListNode(rest);
        }
        return result.next;
    }
}
