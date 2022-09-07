package com.wan.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author wan
 * @Description:
 * @date 2021/12/8 15:49
 */
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap();
        map.put("san",1);
        map.put("yi",1);
        map.put("wu",1);
        map.put("er",1);
        map.put("si",1);
        map.entrySet().forEach(item -> System.out.println(item));

    }
}
