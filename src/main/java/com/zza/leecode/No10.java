package com.zza.leecode;

import java.util.*;

public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> re = new ArrayList<>();
        re.add(arr[0]);
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    re.add(arr[i]);
                }
            }
        }
        for (Integer i : re) {
            System.out.println(i);
        }
    }


}
