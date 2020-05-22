package com.zza.subscribe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MessageService implements Service {
    private static Map<String,Observice> observerMap = new ConcurrentHashMap<>();

    @Override
    public boolean addSubscribe(final Observice observice) {
        observerMap.put(observice.getId(),observice);
        System.out.println(String.format("用户Id %s 插入成功 ", observice.getId()));
        return true;
    }

    @Override
    public boolean removeSubscribe(final Observice observice) {
        if (observerMap.get(observice.getId()) == null){
            System.out.println(String.format("用户Id %s 不存在 移除失败", observice.getId()));
            return false;
        }
        observerMap.remove(observice.getId());
        System.out.println(String.format("用户Id %s 已经移除 ", observice.getId()));
        return true;
    }

    @Override
    public synchronized void push(Object S) {
        if (null == S) return;
        observerMap.forEach((k,v)-> v.gotIt(S));
    }
}
