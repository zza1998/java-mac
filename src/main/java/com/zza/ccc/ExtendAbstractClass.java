package com.zza.ccc;

public class ExtendAbstractClass extends AbstractClass {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return super.getId();
    }
}
