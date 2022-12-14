package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 343. 整数拆分
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 * 3 + 3 3 * 3
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-break
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/11 16:58
 */
public class IntegerBreakSolution {
    public static int integerBreak(int n) {
        int[] f = new int[n+1];
        f[1] = 0;
        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {

                max = Math.max(j*(i-j), Math.max(max, j*f[i-j]));
            }
            f[i] = max;

        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
