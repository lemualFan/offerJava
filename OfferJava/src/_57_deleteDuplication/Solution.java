package _57_deleteDuplication;
/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */



public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null) return null;
        if(pHead.next==null) return pHead;

        ListNode result = new ListNode(0);
        result.next=null;
        ListNode p1 = pHead;

        ListNode cur = result;
        while(p1!=null){
            boolean flag = true;
            ListNode p2 = p1.next;
            if(p2==null) {
                ListNode node = new ListNode(p1.val);
                cur.next = node;
                cur = cur.next;
                break;
            }
            while(p1.val == p2.val){
                flag=false;
                p2=p2.next;
                if(p2==null) break;
            }
            if(flag){
                ListNode node = new ListNode(p1.val);
                cur.next = node;
                cur = cur.next;
                p1=p1.next;
            }else{
                p1=p2;
            }
        }
        if(result.next==null){
            return null;
        }else{
            System.out.println(result.next.val);
        }
        ListNode newnode = result.next;
        return result.next;
    }
}
