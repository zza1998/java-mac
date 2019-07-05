package com.zza.check;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        //排序与倒顺序
        int[] s=new int[]{3,5,37,3,2,6};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        int[] b=s.clone();
        for (int i=0;i<s.length;i++){
            b[i]=s[s.length-1-i];
        }
        System.out.println(Arrays.toString(b));

    }
}
