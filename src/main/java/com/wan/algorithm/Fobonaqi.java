package com.wan.algorithm;

public class Fobonaqi {
    public static void main(String[] args) {
        System.out.println(get(15));
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    }
    public static Integer get(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        Integer sum = get(n-1)+get(n-2);

        return sum;
    };
}
