package _1offer1._26_ComplexListClone;

/*
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }

        RandomListNode p = pHead;
        //第一步在原始链表元素的后面复制该元素
        while (p!=null){
            RandomListNode node = new RandomListNode(p.label);
            node.next=p.next;
            p.next=node;
            p=node.next;
        }

        //给randomnext赋值
        p = pHead;
        while (p!=null){
            if(p.random!=null){
                p.next.random = p.random.next;
            }
            p=p.next.next;
        }

        //将clone链表与原链表分离
        p = pHead;
        RandomListNode newHead = pHead.next;
        RandomListNode temp = newHead;
        while (p!=null){
            p.next=p.next.next;
            if(temp.next!=null){
                temp.next = temp.next.next;
            }
            temp=temp.next;
            p=p.next;
        }
        return  newHead;
    }
}