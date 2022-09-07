package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 258. 各位相加
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: num = 38
 * 输出: 2
 * 解释: 各位相加的过程为：
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * 由于 2 是一位数，所以返回 2。
 * 示例 1:
 *
 * 输入: num = 0
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/3 9:04
 */
public class AddDigitsSolution {
    public static int addDigits(int num) {
        int sum = 0;
        while(num%10 >= 0 ) {
            int a = num%10;
            num = num/10;
            sum +=a;
            if(num == 0) {
                num = sum;
                if(sum/10<=0) {
                    return sum;
                }
                sum = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(11111));
    }
}
