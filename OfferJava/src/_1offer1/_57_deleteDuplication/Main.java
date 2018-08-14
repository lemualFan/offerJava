package _1offer1._57_deleteDuplication;

public class Main {
    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(1);
        ListNode p3 = new ListNode(2);
        ListNode p4 = new ListNode(3);
        ListNode p5 = new ListNode(3);
        ListNode p6 = new ListNode(4);
        ListNode p7 = new ListNode(5);
        ListNode p8 = new ListNode(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = p8;
        p8.next = null;
        Solution solution = new Solution();
        ListNode result = solution.deleteDuplication(p1);
        System.out.println(result.next.val+"");
    }
}
