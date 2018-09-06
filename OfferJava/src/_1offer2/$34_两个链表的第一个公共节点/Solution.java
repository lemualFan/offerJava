package _1offer2.$34_两个链表的第一个公共节点;

import offerStructs.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null) return null;
        ListNode res =null;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (pHead1!=null){
            stack1.push(pHead1);
            pHead1=pHead1.next;
        }
        while (pHead2!=null){
            stack2.push(pHead2);
            pHead2=pHead2.next;
        }
        while (!stack1.isEmpty()&&!stack2.isEmpty()&&stack1.peek().val==stack2.peek().val){
            res = stack1.pop();
            stack2.pop();
        }

        return res;
    }
}