package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 斐波那契数列
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/3 10:00
 */
public class FibSolution {
    public static int fib(int n) {
        int first = 0;
        int second = 1;
        int temp = 0;
        if(n < 2) {
            System.out.println(n);
        }
        for (int i = 2; i <= n; i++) {
            temp = second;
            second = first + second;
            first = temp;

        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
