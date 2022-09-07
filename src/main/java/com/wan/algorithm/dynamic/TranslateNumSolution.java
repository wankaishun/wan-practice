package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 剑指 Offer 46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * 0a 1b 2c 3d 4e 5f 6g 7h 8i 9j 10k 11l 12m 13n 14o 15p 16q 17r 18s 19t 20u 21v 22w 23x 24y 25z
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/22 16:00
 */
public class TranslateNumSolution {
    public static int translateNum(int num) {
        if(num <10) {
            return  1;
        }
        String s = String.valueOf(num);
        int length = s.length();
        int[] dp = new int[length];
        dp[0] = 1;
        int current = Integer.parseInt(String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1)));
        dp[1] = 2;
        if(current>25) {
            dp[1] = 1;
        }

        for (int i = 2; i < length; i++) {
              current = Integer.parseInt(String.valueOf(s.charAt(i-1))+String.valueOf(s.charAt(i)));
            if(current<=25 && current>=10) {
                dp[i] = dp[i-1]+dp[i-2];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[length-1];
    }
//122
//    1 2 2 5
//    12 2 5
//    1 2 25
//    12 25
//    1 22 5
    public static void main(String[] args) {
        System.out.println(translateNum(10));
    }
}
