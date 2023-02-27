package sort_list;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4,
            new ListNode(2,
                new ListNode(3, new ListNode(1, null))));


        System.out.println(new Solution().sortList(listNode));
    }
}
