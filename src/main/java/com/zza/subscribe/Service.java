package com.zza.subscribe;

public interface Service {

    boolean addSubscribe(Observice observice);

    boolean removeSubscribe(Observice observice);

    void push(Object o);


}
