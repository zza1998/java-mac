package com.zza.jianzhiOffer.no11;

import com.zza.jianzhiOffer.no1.ListNode;

public class Test11 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        a.next = b;
        b.next = c;
        ListNode ln= ReverseList(a);
        System.out.println(ln.val);
        while (ln.next!=null){
            ln=ln.next;
            System.out.println(ln.val);
        }
    }

    /**
     * 输入一个链表，反转链表后，输出新链表的表头。
     * @param head
     * @return
     */
    public static ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }

        ListNode store = new ListNode(head.val);
        while (head.next!=null) {
            head = head.next;
            ListNode newNode = new ListNode(head.val);
            newNode.next = store;
            store = newNode;
        }

        return store;
    }
}
