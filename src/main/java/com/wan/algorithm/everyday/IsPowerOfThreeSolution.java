package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 326. 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 27
 * 输出：true
 * 示例 2：
 *
 * 输入：n = 0
 * 输出：false
 * 示例 3：
 *
 * 输入：n = 9
 * 输出：true
 * 示例 4：
 *
 * 输入：n = 45
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-three
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/23 10:21
 */
public class IsPowerOfThreeSolution {
    public static boolean isPowerOfThree(int n) {
        int result = n;
        int remainder = -1;
        if(n == 1) {
            return true;
        }
        while(true) {
            remainder = result%3;
            result = result/3;
            if(result ==1 && remainder==0) {
                return true;
            }
            if(remainder <3 && remainder>0) {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
