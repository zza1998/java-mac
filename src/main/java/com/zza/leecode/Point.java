package com.zza.leecode;

import java.lang.reflect.Field;

public class Point {

    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
    public class s{
        private  String a="aaa";
        public String name = "abc";
    }

    public static void main(String[] args) {
        try {
            Field a = s.class.getField("a");
            System.out.println(a);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
