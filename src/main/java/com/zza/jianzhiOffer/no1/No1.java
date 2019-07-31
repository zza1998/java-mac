package com.zza.jianzhiOffer.no1;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class No1 {

    public static void main(String[] args) {
            ListNode a = new ListNode(1);
            ListNode b = new ListNode(2);
            ListNode c = new ListNode(3);
            a.next=b;
            b.next=c;
            No1 N=new No1();
        System.out.println(N.printListFromTailToHead(a));
    }

    public  ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        if (listNode==null){
            return res;
        }
        if (listNode.next==null){
            res.add(listNode.val);
            return res;
        }
        while (listNode.next!=null){
          arrayDeque.addLast(listNode.val);
          listNode=listNode.next;
        }
        arrayDeque.addLast(listNode.val);
        while (!arrayDeque.isEmpty()){
            res.add(arrayDeque.removeLast());
        }
        return res;
    }

}
