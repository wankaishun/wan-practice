package com.wan.collections;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wan
 * @Description: linkedlist
 * @date 2021/10/27 9:44
 */
public class TestLinkedList {

    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        AtomicInteger cnt = new AtomicInteger();
        cnt.incrementAndGet();
        while (true) {
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(() -> {
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            });
            executorService.execute(() -> {
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.get(i);
                    }
                }
            });
            executorService.shutdown();
        }
    }
}
