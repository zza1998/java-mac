package com.zza.ccc;

import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int weizhi=sc.nextInt();
        int[] tb=new int[num];
        for (int i=0;i<num;i++){
            tb[i]=sc.nextInt();
        }
        System.out.println(cishu(weizhi,tb));
    }
    private static int cishu(int wz,int[] tb){
        if (tb[wz-1]>tb.length-wz+1){
            System.out.println(1);
            return 1;
        }
        else {
            int off=0;
            while (off==0){
                int next=tb[wz-1+tb[wz-1]];
                int pre=tb[wz-1-tb[wz-1]];
                if (next==0&&pre==0){
                    off=1;
                    return -1;
                }
                if (next>tb.length-(wz-1+tb[wz-1]+1)){
                    return 2;
                }
                if (pre>tb.length-wz-1-tb[wz-1]-1){
                    return 2;
                }
                return 3;
            }
        }
        return -1;
    }
}
