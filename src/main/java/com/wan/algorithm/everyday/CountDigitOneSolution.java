package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 1的个数
 * 233 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 13
 * 输出：6
 * 示例 2：
 *
 * 输入：n = 0
 * 输出：0
 *  
 *
 * 提示：
 *
 * 0 <= n <= 2 * 109
 * 通过次数19,575提交次数45,999
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-digit-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/13 9:17
 */
public class CountDigitOneSolution {
    public static int countDigitOne(int n) {
        if(n == 0) {
            return 0;
        }
        int current = 1;
        int next = 0;
        int sum = 0;
        int c =0;
        for (int i = 1; i <= n; i++) {
            if(i%10 == 1 ) {
                next = current -1 ;
                sum += current;
                current = next;
            }
            if(i%10 == 0 ) {
                next = current +1;
                sum += current;
                current = next;

            }
            if(i%10 <9 && i%10 > 1) {
                next = current;
                sum += current;
                current = next;
            }
            if(i == 199) {
                System.out.println();
            }
            if(i%10 == 9) {
                int base = 1999999999;
                int a =  base - i;

                if(a%10 == 8 ) {
                    next = current - 1 ;
                    sum += current;
                    current = next;
                }
                if(a%10 == 9 || a%10 == 0 ) {
                    next = current + 1 ;
                    sum += current;
                    current = next;
                }
                if(a%10<8 && a%10>0) {
                    next = current ;
                    sum += current;
                    current = next;
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(countDigitOne(199));
    }
}
