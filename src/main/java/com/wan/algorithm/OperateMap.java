package com.wan.algorithm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wan
 * @Description: 操作存储类
 * @date 2021/10/19 14:00
 */
public class OperateMap {
    private static final Map<Integer, Integer> mqClients = new ConcurrentHashMap<Integer, Integer>();
    public  static void insert(int key, int value) {
        mqClients.putIfAbsent(key, value);
    }
    public static void print() {

        System.out.println(mqClients.keySet());
    }
}

