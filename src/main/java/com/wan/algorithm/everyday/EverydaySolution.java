package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wan
 * @Description: 400. 第 N 位数字
 * 给你一个整数 n ，请你在无限的整数序列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...] 中找出并返回第 n 位数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：3
 * 示例 2：
 *
 * 输入：n = 11
 * 输出：0
 * 解释：第 11 位数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是 0 ，它是 10 的一部分
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/nth-digit
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/30 9:07
 */
public class EverydaySolution {
    public static int findNthDigit(int n) {
        List<Integer> list = new ArrayList<>();
        int m = n;
        for (int i = 1; i <= m; i++) {
            int j = 0 ;
            int k = i;
            while(k!= 0) {
                list.add(k%10);
                k = k/10;
                j++;
            }
            if(n<list.size() && list.get(n) != null) {
                break;
            }
            list.clear();
            n = n - j;
        }
        return list.get(n);
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }
}
