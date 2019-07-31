package com.zza.jianzhiOffer.no8;

public class Test {

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */
    public static void main(String[] args) {
        System.out.println(NumberOf1(5));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag!=0){
            if ((n & flag) != 0){
                count++;
            }
            flag = flag<<1;
        }
        return count;
    }
    public double Power(double base, int exponent) {
        double r = 1D;
        if (exponent>0){
            for(int i=0 ;i<exponent;i++){
                r = r*base ;
            }
            return r;
        }
        if (exponent == 0){
            return 1.0;
        }
        for(int i=0 ;i<-exponent;i++){
            r = r*base ;
        }
        return 1.0 / r;
    }
}
