package com.wan.algorithm;

import org.apache.zookeeper.Op;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestClass {

    public static void main(String[] args) throws Exception {

        BigDecimal compensationAmount = new BigDecimal(16.5).setScale(0, BigDecimal.ROUND_HALF_UP);
        System.out.println(compensationAmount);
    }
}
