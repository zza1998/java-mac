package com.zza.jianzhiOffer.no19;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0;i<num;i++){
            int nums = sc.nextInt();
            int[] numarr = new int[nums];
            for (int j=0;j<nums;j++){
                numarr[j] = sc.nextInt();

            }
                iscircle(numarr);
        }
    }

    public static void iscircle(int[] numarr){
        Arrays.sort(numarr);
        if (numarr.length <3){
            System.out.println("NO");
            return;
        }
        if (numarr[numarr.length-1]>=2*numarr[numarr.length-2]){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
