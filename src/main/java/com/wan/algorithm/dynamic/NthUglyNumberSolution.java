package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 264. 丑数 II
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
 *
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 10
 * 输出：12
 * 解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12,15,16,18,20,24,25,27] 是由前 10 个丑数组成的序列。
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：1
 * 解释：1 通常被视为丑数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ugly-number-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/17 13:39
 */
public class NthUglyNumberSolution {
    public static int nthUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            while(dp[a]*2<=dp[i-1] && a< i-1) {
               a++;
            }
            int a2 = dp[a]*2;
            while(dp[b]*3<=dp[i-1] && b< i-1) {
                b++;
            }
            int b3 =dp[b]*3;
            while(dp[c]*5<=dp[i-1] && c< i-1) {
                c++;
            }
            int c5 =dp[c]*5;
            int result = Math.min(a2,Math.min(b3,c5));
            dp[i] = result;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
