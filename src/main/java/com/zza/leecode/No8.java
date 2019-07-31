package com.zza.leecode;


import java.util.Scanner;

/**
 *  26进制数相加
 *
 */
public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] a1 = charToInt(a.toCharArray());
        int[] a2 = charToInt(b.toCharArray());
        if (a1.length < a2.length) {
            addIt(a1, a2);
        } else {
            addIt(a2, a1);
        }
    }

    private static void addIt(int[] a1, int[] a2) {
        int jin = 0;
        int[] a3 = new int[a2.length + 1];
        for (int i = 0; i < a1.length; i++) {
            int inr = a1[a1.length - 1 - i] + a2[a2.length - 1 - i] + jin;
            a3[i] = inr % 26;
            jin = inr / 26;
        }
        if (jin == 1 && a2.length == a1.length) {
            a3[a2.length] = 1;
        }
        if (a2.length > a1.length) {
            for (int i = 0; i < a2.length - a1.length; i++) {
                a3[a1.length + i] = a2[a2.length - a1.length - i - 1] + jin;
                jin = 0;
            }
        }
        for (int i = 0; i < a3.length; i++) {
            if (i == 0 && a3[a3.length - 1] == 0) {
            } else {
                System.out.print((char) (a3[a3.length - 1 - i] + 'a'));
            }

        }
    }

    private static int[] charToInt(char[] toCharArray) {
        int[] res = new int[toCharArray.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = toCharArray[i] - 'a';
        }
        return res;
    }


}
