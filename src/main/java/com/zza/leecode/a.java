package com.zza.leecode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.zip.InflaterInputStream;

public class a {
    public static void main(String[] args) {
        int[] a=new int[]{56,-21,56,35,-9};
        System.out.println(shortestSubarray(a,61));
    }

    public static int shortestSubarray(int[] A, int K) {
        if (isone(A,K)){
            return 1;
        }
        int sum = 0;
        int num = 0;
        int pre = 0;
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
            if (sum>=K){

                if (i==0){
                    return 1;
                }
                if (num==0){
                    num=i-pre+1;
                }
                if (num!=0&&i-pre+1<num){
                    num=i-pre+1;
                    pre=i   ;
                }
                for (int j=0;j<i-pre+1;j++){
                    if (sum-A[pre+j]>=K){
                        num--;
                        sum-=A[pre+j];
                    }else {
                        break;
                    }
                }
                sum=0;
            }
        }
        return num==0?-1:num;
    }

    public static boolean isone(int[] A, int K){
        int[] B=A.clone();
        Arrays.sort(B);
        return B[B.length - 1] >= K;
    }
}
