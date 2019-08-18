package com.zza.check;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TT {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,3,4,4};
        findFrom(arr);
    }
    public static  void  findFrom(int[] arr){
        int len = arr.length, res = 0;
        for ( int i = 0; i<len;i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
