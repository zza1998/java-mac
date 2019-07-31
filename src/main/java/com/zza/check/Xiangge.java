package com.zza.check;

import java.util.ArrayList;
import java.util.Scanner;

public class Xiangge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int distance = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList a = new ArrayList();
        calculate(distance, arr);
    }

    public static void calculate(int distance, int[] arr) {
        int num = 0;
        if (arr.length < 3) {
            System.out.println(num);
        }


    }
}
