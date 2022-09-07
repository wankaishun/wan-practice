package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 反转字符串 II
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *  
 * 示例 1：
 *
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 * 示例 2：
 *
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 *  
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅由小写英文组成
 * 1 <= k <= 104
 * 通过次数47,434提交次数80,453
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/20 9:22
 */
public class ReverseStrSolution {
    public static  String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int index = 0;
        int length =c.length;
        while(length>0) {
            int start = 2*k*index;
            int end = 2*k*index +k -1;
            if(length < k) {
                start = 2*k*index;
                end = 2*k*index + length -1;
            }
            while(start <= end) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start ++;
                end --;
            }
            length = length-2*k;
            index ++;
        }


        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("avaads", 5));
    }
}
