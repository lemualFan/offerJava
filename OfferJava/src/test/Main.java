package test;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next= null;
        ListNode p = listNode;
        for (int i=1;i<10;i++){
            ListNode Node = new ListNode(i);
            p.next = Node;
            p= Node;
        }
        int index =0;
//        while(listNode!=null){
//            System.out.print(listNode.val+" "+index+"||");
//            index++;
//            listNode=listNode.next;
//        }
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
        ListNode res = solution.Merge(nodea,nodea);
        while (res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }

    }
}

class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode List1 = list1;
        ListNode List2 = list2;
        ListNode newHead = null;
        ListNode p = null;

        if (List1 == null) {
            return list2;
        }
        if (List2 == null) {
            return list1;
        }

        while (List1 != null && List2 != null) {
            if (List1.val <= List2.val) {
                if (newHead == null) {
                    newHead = p = List1;
                    System.out.println("QQ");
                } else {
                    p.next = List1;
                    p = p.next;
                    System.out.println(p.val + "1");
                }
                List1 = List1.next;

            } else {
                if (newHead == null) {
                    newHead = p = List2;
                } else {
                    p.next = List2;
                    System.out.println(p.val + "1");
                    p = p.next;

                }
                List2 = List2.next;
            }
        }

        if (List1 != null) {
            p.next = List1;
        }
        if (List2 != null) {
            p.next = List2;
        }
        return newHead;
    }
}


