package _1offer1._15_FIndKthToTail;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
/*
输入一个链表，输出该链表中倒数第k个结点
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode nodea = new ListNode(2);
        ListNode nodeb = new ListNode(3);
        ListNode nodec = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        nodea.next = nodeb;
        nodeb.next = nodec;
        Solution solution = new Solution();

        ListNode res = solution.MergeRsc(node1,nodea);
        while (res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }

    }
}




 class Solution {
     public ListNode MergeRsc(ListNode list1,ListNode list2){
         if(list1 == null)
             return list2;
        else if(list2 == null)
             return list1;
         ListNode newHead = null;
         if(list1.val<list2.val){
             newHead = list1;
             newHead.next = MergeRsc(list1.next,list2);
         }else{
             newHead = list2;
             newHead.next = MergeRsc(list1,list2.next);
         }

         return  newHead;
     }

     public ListNode Merge(ListNode list1,ListNode list2) {
         ListNode List1 = list1;
         ListNode List2 = list2;
         ListNode newHead = null;
         ListNode p = null;

         if(List1==null){
             return list2;
         }
         if(List2==null){
             return list1;
         }

         while(List1!=null&&List2!=null){
             if(List1.val<=List2.val){
                 if(newHead == null){
                     newHead = p = List1;
                     System.out.println("QQ");
                 }else{
                     p.next=List1;
                     p = p.next;
                     System.out.println(p.val+"1");
                 }
                 List1=List1.next;

             }else{
                 if(newHead==null){
                     newHead = p = List2;
                 }else{
                     p.next=List2;
                     p = p.next;

                 }
                 List2=List2.next;
             }
         }

         if(List1!=null){
             p.next=List1;
         }
         if(List2!=null){
             p.next=List2;
         }
         return  newHead;
     }

    public ListNode FindKthToTail(ListNode head,int k) {
          ListNode p = head;
          ListNode result=head;
          int num=1 ;
          while(p.next!=null){
              num++;
              p=p.next;
          }
          int res = num - k-1;
          while(res>=0){
              result = result.next;
              res--;
          }
          return result;

    }

     public ListNode ReverseList(ListNode head) {
         ListNode pNode = null;
         ListNode newHead = null;
         ListNode pPre = null;
         pNode = head;
         while(pNode!=null){
             ListNode pNext  = pNode.next;
             if(pNext==null){
                 newHead = pNode;
             }
             pNode.next = pPre;
             pPre = pNode;
             pNode = pNext;
         }

         return  newHead;
     }



}

