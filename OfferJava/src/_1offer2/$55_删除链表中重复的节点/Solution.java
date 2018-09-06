package _1offer2.$55_删除链表中重复的节点;

import offerStructs.ListNode;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null) return null;
        ListNode current;
        ListNode next;
        ListNode forward;
        current = pHead;
        ListNode res = new ListNode(0);
        forward = res;
        forward.next = pHead;
        while (current!=null){
            if (current.next!=null){
                next = current.next;
                if(current.val!=next.val){
                    forward = current;
                    current=current.next;
                }else {
                    while (next.next!=null&&next.val==next.next.val){
                        next=next.next;
                    }
                    forward.next = next.next;
                    current = next.next;
                }
            }else {
                break;
            }
        }
        return res.next;
    }
}