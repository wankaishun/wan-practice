package com.wan.algorithm.everyday;

import java.util.Objects;

/**
 * @author wan
 * @Description: 58. 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 示例 3：
 *
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅有英文字母和空格 ' ' 组成
 * s 中至少存在一个单词
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/22 17:31
 */
public class LengthOfLastWordSolution {
    public static int lengthOfLastWord(String s) {
        int length = s.length();
        int size = 0;
        boolean a = false;
        for (int i = length -1; i>=0; i--) {
            char item = s.charAt(i);
            if(item != ' ') {
                size ++;
                a = true;
            }else {
                if(a == true) {
                    return size;
                }
                size = 0;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
