package com.zza.ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class ccc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] ar = new int[num];
            for (int i = 0; i < num; i++) {
                ar[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            distance(ar, k);
        }

    }

    public static void distance(int[] ar, int k) {
        int num = ar.length;
        if (k >= num) {
            System.out.println("null");
            return;
        }
        System.out.println(ar[num - k + 1]);
    }
}
