package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 397. 整数替换
 * 给定一个正整数 n ，你可以做如下操作：
 *
 * 如果 n 是偶数，则用 n / 2替换 n 。
 * 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
 * n 变为 1 所需的最小替换次数是多少？
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 8
 * 输出：3
 * 解释：8 -> 4 -> 2 -> 1
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：4
 * 解释：7 -> 8 -> 4 -> 2 -> 1
 * 或 7 -> 6 -> 3 -> 2 -> 1
 * 示例 3：
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-replacement
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/16 10:23
 */
public class IntegerReplacementSolution {
    public static int integerReplacement(int n) {
        return (int)solve(n);
    }
    static long solve(long n) {
        return n == 1 ? 0 : 1 + (n % 2 == 0 ? solve(n / 2) : Math.min(solve(n + 1), solve(n - 1)));
    }


    public static void main(String[] args) {
        //617 618 309 310 155 156 78 39 40 20 10 5 4 2 1
        System.out.println(integerReplacement(155));
    }
}
