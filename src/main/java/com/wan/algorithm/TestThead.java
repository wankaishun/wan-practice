package com.wan.algorithm;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wan
 * @Description: ceshi
 * @date 2021/5/12 11:53
 */
public class TestThead {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10,
                60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue(10000));

        List<Map> list = new ArrayList<Map>();
        for (int i = 1;i<=10000; i++) {
            Map map = new HashMap();
            map.put(i,i);
            list.add(map);
        }
        Set set = new HashSet();
        int i = 0;
        for (Map map :list) {
            System.out.println(++i +"======"+map.get(i));
            int j = i;
            executor.execute(()->{
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread" +j +"======"+map.get(j));
                if(set.add(map) == false){
                    System.out.println("出现重复");
                };
            }) ;
        }

        executor.shutdown();

        System.out.println("========"+set.size());
    }
}
