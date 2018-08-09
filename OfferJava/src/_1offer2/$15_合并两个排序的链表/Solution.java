package _1offer2.$15_合并两个排序的链表;

import offerStructs.ListNode;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (list1!=null&&list2!=null){
            if (list1.val>list2.val){
                p.next = list2;
                p=p.next;
                list2 = list2.next;
            }else{
                p.next = list1;
                p=p.next;
                list1=list1.next;
            }
        }
        if(list1!=null) p.next=list1;
        if(list2!=null) p.next=list2;
        return head.next;
    }
}
