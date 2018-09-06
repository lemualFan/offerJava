package _1offer2.$54_链表中环的入口点;

import offerStructs.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null) return null;
        ListNode res = null;
        Set<ListNode> set = new HashSet<>();
        boolean flag = false;
        while (pHead!=null){
            flag = set.add(pHead);
            if (!flag) return pHead;
            pHead=pHead.next;
        }
        return res;
    }
}

