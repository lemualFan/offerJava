package _1offer2.$14反转链表;

import offerStructs.ListNode;

public class Solution {
    public ListNode ReverseList(ListNode head) {
          if(head == null) return null;
          if(head.next==null) return head;
          ListNode pNode = null;
          ListNode pPre = null;
          ListNode newHead = null;
          pNode = head;
          while (pNode!=null){
              ListNode pNext = pNode.next;
              if(pNext==null){
                  newHead = pNode;
              }
              pNode.next = pPre;
              pPre = pNode;
              pNode=pNext;
          }

          return newHead;
    }
}
