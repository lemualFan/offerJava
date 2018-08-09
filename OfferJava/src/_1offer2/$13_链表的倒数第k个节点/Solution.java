package _1offer2.$13_链表的倒数第k个节点;

import offerStructs.ListNode;

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head==null) return null;
        if(k<=0) return null;
        ListNode first = head;
        while (k>1&&first.next!=null){
            first = first.next;
            k--;
        }
        if(k>1) return null;
        ListNode res = head;
        while (first.next!=null){
            res = res.next;
            first = first.next;
        }
        return res;
    }
}
