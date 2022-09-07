package com.wan.algorithm.sort;

/**
 * @author wan
 * @Description: 冒泡排序
 * @date 2021/8/23 16:06
 */
public class BubbleSortSolution {
    public static int[]  sort(int [] param) {
        int length = param.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length-i; j++) {
                if(j+1 == length-i) {
                    break;
                }
                if(param[j]>=param[j+1]) {
                    int temp = param[j];
                    param[j] = param[j+1];
                    param[j+1] = temp;
                }
            }
        }
        return param;
    }

    public static void main(String[] args) {
        int [] param = {1,3,5,6,5,2,5,3,5,7,2,4,6};
        for (int i : sort(param)) {
            System.out.print(" "+i);
        }

    }
}
