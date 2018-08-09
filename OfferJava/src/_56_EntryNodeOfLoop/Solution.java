package _56_EntryNodeOfLoop;



//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        ListNode pslow = pHead.next;
        if(pslow==null) return null;
        ListNode pfast = pslow.next;
        while(pfast!=null&&pslow!=null){
            if(pfast==pslow) break;
            pfast = pfast.next;
            pslow = pslow.next;
            if(pfast.next!=null) pfast = pfast.next;
        }

        pfast = pHead;
        while(pfast!=pslow){
            pfast = pfast.next;
            pslow = pslow.next;
        }

        return pfast;
    }
}