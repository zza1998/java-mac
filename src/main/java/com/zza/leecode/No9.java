package com.zza.leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No9 {
    /**
     * 喝瓶子 3换1
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> a=new ArrayList<>();
        while (sc.hasNext()){
            int next=Integer.parseInt(sc.next());
            if (next==0){
                break;
            }a.add(next);
        }
        for (Integer n:a
             ) {
            System.out.println(n/2);
        }
        new Thread().interrupt();
    }
}
