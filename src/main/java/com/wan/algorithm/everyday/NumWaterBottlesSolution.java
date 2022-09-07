package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description:
 * @date 2021/12/17 10:50
 */
public class NumWaterBottlesSolution {
    public static int numWaterBottles(int numBottles, int numExchange) {
        return aa(numBottles, 0, numExchange);
    }
    public static int aa(int numBottles,int empty, int numExchange) {
        if((numBottles+empty)<numExchange) {
            return numBottles;
        }
        return numBottles + aa((numBottles+empty)/numExchange,(numBottles+empty)%numExchange, numExchange);
    }
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }

}
