package com.zza.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("man");
        list.add("sss");
        list.forEach(
                System.out::println
        );

        DefaultImpl d1 = new DefaultImpl();
        DefaultImpl2 d2 = new DefaultImpl2();
        d1.takeIt();
        d2.takeIt();

    }
}
