package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 357. 计算各个位数不同的数字个数
 *
给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10n 。

示例:

输入: 2
输出: 91
解释: 答案应为除去 11,22,33,44,55,66,77,88,99 外，在 [0,100) 区间内的所有数字。
 * @date 2021/11/18 17:21
 * 13
 */
public class CountNumbersWithUniqueDigitsSolution {
    public static int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n+1];
        if(n == 0 ) {
            return 1;
        }
        dp[1] =  9;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]*(11-i);
            result += dp[i];
        }
        return result+10;
    }

    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(0));
    }
}
