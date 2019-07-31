package com.zza.jianzhiOffer.no10;

import com.zza.jianzhiOffer.no1.ListNode;

public class Test10 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode ln= FindKthToTail(a,2);
        System.out.println(ln.val);
        while (ln.next!=null){
            ln=ln.next;
            System.out.println(ln.val);
        }
    }

    /**
     * 输出倒数第N个节点
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null||k<0) {
            return null;
        }
        int size = 1;
        ListNode listNode = head;
        while (head.next != null) {
            head = head.next;
            size++;
        }
        if (k > size) {
            return null;
        }
        for (int i = 0; i<size - k ;i++){
            listNode = listNode.next;
        }
        return listNode;
    }

}
