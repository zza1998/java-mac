package com.zza.jianzhiOffer.no7;

public class Test {

    public static void main(String[] args) {


    }
    public int RectCover(int target) {
        if (target<=2){
            return target;
        }
        int a=1;
        int b=2;
        for (int i = 0;i<target-2;i++){
            int x= a;
            int y = b;
            a = y;
            b = x+y;
        }
        return b;
    }
}
