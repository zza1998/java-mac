package com.zza.ccc;

import java.util.Scanner;

public class hhhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] hour = new int[num+1];
        int[] fen =new int[num+1];
        for (int i =0;i<num;i++){
            hour[i] = sc.nextInt();
            fen[i] = sc.nextInt();
        }
        int need = sc.nextInt();
        hour[num]= sc.nextInt();
        fen[num]=sc.nextInt();
        statis(hour,fen,need);

    }

    public static void  statis(int[] hour,int[] fen,int need){
        if (hour.length<=2){
            System.out.println(hour[0]+" "+fen[0]);
        }
        int h = hour[0];
        int f =fen[0];
        for (int i = 0;i<hour.length-1;i++){
            int fn = fen[i];
            int ho = hour[i];
            int pop =(fn+need)/60; //进位
            ho+=pop;
            fn=(fn+need)%60;
            if (ho<hour[hour.length-1]||(ho == hour[hour.length-1]&&fn<=fen[fen.length-1])){
                if (hour[i]>h||fen[i]>=f&&hour[i]==h){
                    h=hour[i];
                    f=fen[i];
                }
            }

        }
        System.out.println(h+" "+f);
    }
}
