package _37_FindFirstCommonNode;


import java.util.Stack;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        if(p1==null||p2==null){
            return null;
        }else if(p1==p2) {
            return p1;
        }
        while (p1!=null){
            stack1.push(p1);
            p1=p1.next;
        }
        while (p2!=null){
            stack2.push(p2);
            p2=p2.next;
        }
        while (!stack1.empty()||!stack2.empty()){
            p1 = stack1.pop();
            p2 = stack2.pop();
            if(stack1.empty()){
                return p1;
            }
            if(stack2.empty()){
                return p2;
            }
            if(p1!=p2){
                return p1.next;
            }
        }
        return  null;
    }

    public ListNode solution2(ListNode pHead1, ListNode pHead2){
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int len1 = 0;
        int len2 = 0;
        while (p1!=null){
            p1= p1.next;
            len1++;
        }

        while (p2!=null){
            p2= p2.next;
            len2++;
        }
        int flag = len1-len2;
        if(flag>0){
            p1=pHead1;
            p2=pHead2;
            while(flag>0){
                p1=p1.next;
                flag--;
            }
            while(len2>0){
                if(p1==p2){
                    return p1;
                }
                p1=p1.next;
                p2=p2.next;
                len2--;
            }
        }else{
            p1=pHead1;
            p2=pHead2;
            flag=-flag;
            while(flag>0){
                p2=p2.next;
                flag--;
            }
            while(len2>0){
                if(p1==p2){
                    return p1;
                }
                p1=p1.next;
                p2=p2.next;
                len2--;
            }
        }
        return null;
    }
}
