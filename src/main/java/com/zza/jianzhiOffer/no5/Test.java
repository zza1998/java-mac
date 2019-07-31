package com.zza.jianzhiOffer.no5;

public class Test {
    public static void main(String[] args) {
        System.out.println(Fibonacci(4));
    }
    public static int Fibonacci(int n) {
        if (n==0||n==1){
            return n;
        }
        int[] f= new int[n+1];
        int a=0;
        int b=1;
        for (int i = 2;i<n+1;i++){
            int c = b;
            int d = a;
            a=c;
            b=b+d;

        }
        return b;
    }
}
