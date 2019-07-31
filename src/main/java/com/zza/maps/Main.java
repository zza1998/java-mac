package com.zza.maps;

import java.util.Hashtable;

/**
 * instanceof 关键字 用来判断类是否是 所指定的类 或 其子类extend继承的类
 */
public class Main {
    public static void main(String[] args) {
        FatherMap fm = new FatherMap();
        SonMap sm = new SonMap();
        SinMap sm2 = new SinMap();
        getClazz(sm2);
    }

    public static void getClazz(FatherMap fm) {
        if (fm instanceof FatherMap) {
            System.out.println(fm.getClass());
        }
        if (fm instanceof SonMap) {
            System.out.println("我是儿子");
            System.out.println(fm.getClass());
        }
        if (fm instanceof SinMap) {
            System.out.println("我是私生子");
            System.out.println(fm.getClass());
        }
    }
}
