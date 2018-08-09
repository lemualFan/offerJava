package _11_Power;


class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    ListNode build(int[] array){
        ListNode h=new ListNode(0);
        ListNode rear=h;
        for(int c:array) {
            ListNode node=new ListNode(c);
            rear.next=node;
            rear=rear.next;
        }
        return h.next;
    }

    void print(ListNode l) {
        while(l!=null) {
            System.out.print(l.val+" ");
            l=l.next;
        }
    }
}

public class Main {
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
//	                System.out.println("QQ");
                }else{
                    p.next=List1;
                    p = p.next;
//	                System.out.println(p.val+"1");
                }
                List1=List1.next;

            }else{
                if(newHead==null){
                    newHead = p = List2;
                }else{
                    p.next=List2;
                    p = p.next;
//	                System.out.println(p.val+"2");
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

    public static void main(String[] args) {
        int[] a= {1,2,3,};
        int[] b= {1,2,3};
        ListNode l1=new ListNode(0).build(a);
        ListNode l2=new ListNode(0).build(b);
        new ListNode(0).print(l1);
        System.out.println();
        new ListNode(0).print(l2);
        System.out.println();

        ListNode res=new Main().Merge(l1, l2);

        new ListNode(0).print(res);

    }
}