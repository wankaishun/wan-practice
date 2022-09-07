package com.wan.algorithm.binary;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wan
 * @Description: 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/1/11 14:57
 */
public class AddBinarySolution {
    public static String addBinary(String a, String b) {
            int i = a.length()-1;
            int j = b.length()-1;
            Deque<Integer> deque = new ArrayDeque();
            int add = 0;
            while (!(i == -1 && j == -1)) {
                char aa = '0';
                char bb = '0';
                if(i>=0) {
                    aa =  a.charAt(i);
                    i--;
                }
                if(j>=0) {
                    bb =   b.charAt(j);
                    j--;
                }
                int sum = aa-'0'+bb-'0'+add;
                if(sum == 3) {
                    deque.addLast(1);
                    add = 1;
                }else if(sum==2) {
                    deque.addLast(0);
                    add = 1;
                }else if(sum == 1) {
                    deque.addLast(1);
                    add = 0;
                } else {
                    deque.addLast(0);
                    add = 0;
                }

            }
            StringBuffer sb = new StringBuffer();
            if(add == 1) {
                sb.append(add);
            }
            while(!deque.isEmpty()) {
                sb.append(deque.pollLast());
            }

            return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("111", "111"));
    }
}
