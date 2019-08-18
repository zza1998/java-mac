package com.zza.ccc;

public enum EnumIs {
    CHUNTIAN(1,"春天"),
    XIATIAN(2,"夏天"),
    QIUTIAN(3,"秋天"),
    DONGTIAN(4,"冬天");

    private Integer id;

    private String name;

    EnumIs(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


}
