package com.wan.algorithm.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wan
 * @Description: 504. 七进制数
 * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: num = 100
 * 输出: "202"
 * 示例 2:
 *
 * 输入: num = -7
 * 输出: "-10"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/base-7
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/7 10:05
 */
public class ConvertToBase7Solution {
    public static String convertToBase7(int num) {
        // 701

        Deque<Object> deque = new ArrayDeque();
        StringBuffer sb  = new StringBuffer();
        if(num<0) {
            sb.append("-");
        }
        num = Math.abs(num);
        if(num < 7) {
            sb.append(num);
        }
        while(num>=7) {
            int a = num%7;
            deque.offerFirst(a);
            num = num/7;
            if(num<7) {
                deque.offerFirst(num);
            }
        }

        while(!deque.isEmpty()) {
            sb.append(deque.pollFirst());

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(1));
    }
}
