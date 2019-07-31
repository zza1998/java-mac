package com.zza.jianzhiOffer.no12;

import com.zza.jianzhiOffer.no1.ListNode;

public class Test12 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        a.next = b;
        b.next = c;
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(6);
        d.next = e;
        e.next = f;

        ListNode ln = Merge(a,d);
        System.out.println(ln.val);
        while (ln.next!=null){
            ln=ln.next;
            System.out.println(ln.val);
        }

    }

    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode res = null;
        if(list1.val<list2.val){
            res = list1;
            res.next = Merge(list1.next, list2);
        }else{
            res = list2;
            res.next = Merge(list1, list2.next);
        }
        return res;

    }

}
