package com.wan.algorithm.greedy;

import java.util.*;

/**
 * @author wan
 * @Description: 409. 最长回文串
 * 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 示例 1:
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * @date 2021/9/8 9:47
 */
public class LongestPalindromeSolution {
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int result = 0;
        boolean a = false;
        for (int i : count) {
            if((i&1) == 0) {
                result = result + i;
            }
            if((i&1) == 1) {
                result = result + i - 1;
                a = true;
            }
        }
        if(a == true) {
            return result +1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("adasdadccxx"));
    }
}
