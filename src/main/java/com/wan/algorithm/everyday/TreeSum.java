package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * @date 2021/10/11 17:16
 * 1000
 * 0010
 */
public class TreeSum {
    public static int divide(int dividend, int divisor) {
        boolean a = false;
        if((dividend<0 && divisor<0)||(dividend>0 && divisor>0)) {
            a = false;
        }else {
            a=true;
        }
        if(divisor == 0) {
            return 0;
        }
        int result = 0;
        while(dividend>=divisor) {
            if(a == false) {
                dividend = dividend - divisor;
            }else {
                dividend = dividend + divisor;
            }

            result ++;
        }
        if(a == true) {
            return -result;
        }
        return  result;

    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,
                1));
    }
}
