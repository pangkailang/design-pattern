package com.example.design.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SharePool {
    private Map<String,Share> shareMap = new ConcurrentHashMap<>();
    public Share setShare(String key) {
        if(shareMap.get(key)!=null){
        }else{
            Share share = new Share();
            shareMap.put(key, share);
        }
        return shareMap.get(key);
    }
}
