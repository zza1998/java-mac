package com.zza.maps;

import lombok.Data;

@Data
public class FatherMap implements Comparable<FatherMap>{

    private String value;

    private int size;

    public void say() {
        System.out.println("Im father");
    }



    @Override
    public int compareTo(FatherMap o) {
        return size-o.size;

    }
}
