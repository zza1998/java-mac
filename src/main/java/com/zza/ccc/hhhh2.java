package com.zza.ccc;

import java.util.Arrays;
import java.util.Scanner;

public class hhhh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ages = new int[num];
        for (int i =0;i<num;i++){
            ages[i] = sc.nextInt();
        }
        int[] arr = new int[num];
        int[] res =salary(ages,arr);
        int base = num;
        for (int j=0;j<res.length;j++){
            base+=res[j];
        }
        System.out.println(base*100);
    }

    public static int[] salary(int[] ages,int[] arr){
        int[] sa = arr;
        int flag = 0;
        for (int i = 0;i<ages.length;i++){
            if ((ages[i]>ages[i-1<0?0:i-1]&&sa[i]<=sa[i-1<0?0:i-1])||
                    (sa[i]<=sa[i+1>ages.length-1?ages.length-1:i+1]&&ages[i]>ages[i+1>ages.length-1?ages.length-1:i+1])){
                sa[i]++;
                flag++;
            }
        }
        if (flag==0){
            return sa;
        }
        else {
            return salary(ages,sa);
        }
    }
}
