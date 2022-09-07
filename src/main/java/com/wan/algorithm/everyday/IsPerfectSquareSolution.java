package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 367. 有效的完全平方数
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：num = 16
 * 输出：true
 * 示例 2：
 *
 * 输入：num = 14
 * 输出：false
 *  
 *
 * 提示：
 *
 * 1 <= num <= 2^31 - 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-perfect-square
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/4 14:07
 */
public class IsPerfectSquareSolution {
    public static boolean isPerfectSquare(int num) {
      //1+3+5+7+9+…+(2n-1)=n^2
        int num1 = 1;
        while(num>0) {
            num-=num1;
            num1 +=2;
        }

        return num==0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2));
    }
}
